/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.jvm.runtime

import org.jetbrains.kotlin.cli.common.output.outputUtils.writeAllTo
import org.jetbrains.kotlin.codegen.GeneratedClassLoader
import org.jetbrains.kotlin.codegen.GenerationUtils
import org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.jvm.compiler.ExpectedLoadErrorsUtil
import org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil
import org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader
import org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass
import org.jetbrains.kotlin.load.kotlin.reflect.RuntimeModuleData
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.FqNameUnsafe
import org.jetbrains.kotlin.renderer.DescriptorRenderer
import org.jetbrains.kotlin.renderer.DescriptorRendererBuilder
import org.jetbrains.kotlin.resolve.descriptorUtil.resolveTopLevelClass
import org.jetbrains.kotlin.resolve.scopes.JetScope
import org.jetbrains.kotlin.resolve.scopes.RedeclarationHandler
import org.jetbrains.kotlin.resolve.scopes.WritableScope.LockLevel
import org.jetbrains.kotlin.resolve.scopes.WritableScopeImpl
import org.jetbrains.kotlin.test.ConfigurationKind
import org.jetbrains.kotlin.test.JetTestUtils
import org.jetbrains.kotlin.test.TestCaseWithTmpdir
import org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator
import org.jetbrains.kotlin.types.TypeSubstitutor
import org.jetbrains.kotlin.utils.sure
import java.io.File

public abstract class AbstractJvmRuntimeDescriptorLoaderTest : TestCaseWithTmpdir() {
    class object {
        private val renderer = DescriptorRendererBuilder()
                .setWithDefinedIn(false)
                .setExcludedAnnotationClasses(listOf(
                        ExpectedLoadErrorsUtil.ANNOTATION_CLASS_NAME,
                        "kotlin.deprecated",
                        "kotlin.data",
                        "org.jetbrains.annotations.NotNull",
                        "org.jetbrains.annotations.Nullable",
                        "org.jetbrains.annotations.Mutable",
                        "org.jetbrains.annotations.ReadOnly"
                ).map { FqName(it) })
                .setOverrideRenderingPolicy(DescriptorRenderer.OverrideRenderingPolicy.RENDER_OPEN_OVERRIDE)
                .setIncludeSynthesizedParameterNames(false)
                .setIncludePropertyConstant(false)
                .setVerbose(true)
                .build()
    }

    // NOTE: this test does a dirty hack of text substitution to make all annotations defined in source code retain at runtime.
    // Specifically each "annotation class" is replaced by "Retention(RUNTIME) annotation class"
    protected fun doTest(ktFileName: String) {
        val ktFile = File(ktFileName)

        val environment = JetTestUtils.createEnvironmentWithMockJdkAndIdeaAnnotations(myTestRootDisposable, ConfigurationKind.ALL)
        val jetFile = JetTestUtils.createFile(ktFileName, loadFileAddingRuntimeRetention(ktFile), environment.getProject())
        val classFileFactory = GenerationUtils.compileFileGetClassFileFactoryForTest(jetFile)
        val classLoader = GeneratedClassLoader(classFileFactory, null, ForTestCompileRuntime.runtimeJarForTests().toURI().toURL())

        classFileFactory.writeAllTo(tmpdir)

        val module = RuntimeModuleData.create(classLoader).module

        // Since runtime package view descriptor doesn't support getAllDescriptors(), we construct a synthetic package view here.
        // It has in its scope descriptors for all the classes and top level members generated by the compiler
        val actual = object : PackageViewDescriptor {
            val scope = WritableScopeImpl(JetScope.Empty, this, RedeclarationHandler.THROW_EXCEPTION, "runtime descriptor loader test")

            override fun getFqName() = LoadDescriptorUtil.TEST_PACKAGE_FQNAME
            override fun getMemberScope() = scope
            override fun getModule() = module
            override fun <R, D> accept(visitor: DeclarationDescriptorVisitor<R, D>, data: D): R =
                    visitor.visitPackageViewDescriptor(this, data)

            override fun getContainingDeclaration() = throw UnsupportedOperationException()
            override fun getOriginal() = throw UnsupportedOperationException()
            override fun substitute(substitutor: TypeSubstitutor) = throw UnsupportedOperationException()
            override fun acceptVoid(visitor: DeclarationDescriptorVisitor<Void, Void>?) = throw UnsupportedOperationException()
            override fun getAnnotations() = throw UnsupportedOperationException()
            override fun getName() = throw UnsupportedOperationException()
        }

        val scope = actual.getMemberScope()
        scope.changeLockLevel(LockLevel.BOTH)

        for (outputFile in classLoader.getAllGeneratedFiles()) {
            val className = outputFile.relativePath.substringBeforeLast(".class").replace('/', '.').replace('\\', '.')

            val klass = classLoader.loadClass(className).sure("Couldn't load class $className")

            when (ReflectKotlinClass.create(klass)!!.getClassHeader().kind) {
                KotlinClassHeader.Kind.PACKAGE_FACADE -> {
                    val packageView = module.getPackage(actual.getFqName()) ?: error("Couldn't resolve package ${actual.getFqName()}")
                    for (descriptor in packageView.getMemberScope().getAllDescriptors()) {
                        when (descriptor) {
                            is FunctionDescriptor -> scope.addFunctionDescriptor(descriptor)
                            is PropertyDescriptor -> scope.addPropertyDescriptor(descriptor)
                        }
                    }
                }
                KotlinClassHeader.Kind.CLASS -> {
                    val classDescriptor =
                            resolveClassByFqNameInModule(module, FqNameUnsafe(className)).sure("Couldn't resolve class $className")
                    if (classDescriptor.getContainingDeclaration() is PackageFragmentDescriptor) {
                        scope.addClassifierDescriptor(classDescriptor)
                    }
                }
            }
        }

        val expected = LoadDescriptorUtil.loadTestPackageAndBindingContextFromJavaRoot(tmpdir, getTestRootDisposable(),
                                                                                       ConfigurationKind.ALL)
        val comparatorConfiguration = RecursiveDescriptorComparator.DONT_INCLUDE_METHODS_OF_OBJECT
                .checkPrimaryConstructors(true)
                .checkPropertyAccessors(true)
                .withRenderer(renderer)
        RecursiveDescriptorComparator.validateAndCompareDescriptors(expected.first, actual, comparatorConfiguration, null)
    }

    private fun loadFileAddingRuntimeRetention(file: File): String {
        return file.readText().replace(
                "annotation class",
                "[java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)] annotation class"
        )
    }

    // Resolves not only top level classes, but also nested classes, including class objects and classes nested within them
    private fun resolveClassByFqNameInModule(module: ModuleDescriptor, fqName: FqNameUnsafe): ClassDescriptor? {
        if (fqName.isRoot()) return null

        if (fqName.isSafe()) {
            val topLevel = module.resolveTopLevelClass(fqName.toSafe())
            if (topLevel != null) return topLevel
        }

        val parent = resolveClassByFqNameInModule(module, fqName.parent()) ?: return null
        return parent.getUnsubstitutedInnerClassesScope().getClassifier(fqName.shortName()) as? ClassDescriptor
    }
}
