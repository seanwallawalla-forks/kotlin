/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileKotlinAgainstKotlin")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirCompileKotlinAgainstKotlinTestGenerated extends AbstractFirCompileKotlinAgainstKotlinTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
    }

    private void runTestWithPackageReplacement(String testDataFilePath, String packageName) throws Exception {
        KotlinTestUtils.runTestWithCustomIgnoreDirective(filePath -> doTestWithCoroutinesPackageReplacement(filePath, packageName), TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
    }

    public void testAllFilesPresentInCompileKotlinAgainstKotlin() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
    }

    @TestMetadata("annotationInInterface.kt")
    public void testAnnotationInInterface() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/annotationInInterface.kt");
    }

    @TestMetadata("annotationOnTypeUseInTypeAlias.kt")
    public void testAnnotationOnTypeUseInTypeAlias() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/annotationOnTypeUseInTypeAlias.kt");
    }

    @TestMetadata("annotationsOnTypeAliases.kt")
    public void testAnnotationsOnTypeAliases() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/annotationsOnTypeAliases.kt");
    }

    @TestMetadata("callDeserializedPropertyOnInlineClassType.kt")
    public void testCallDeserializedPropertyOnInlineClassType() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/callDeserializedPropertyOnInlineClassType.kt");
    }

    @TestMetadata("callsToMultifileClassFromOtherPackage.kt")
    public void testCallsToMultifileClassFromOtherPackage() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/callsToMultifileClassFromOtherPackage.kt");
    }

    @TestMetadata("classInObject.kt")
    public void testClassInObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/classInObject.kt");
    }

    @TestMetadata("companionObjectInEnum.kt")
    public void testCompanionObjectInEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/companionObjectInEnum.kt");
    }

    @TestMetadata("companionObjectMember.kt")
    public void testCompanionObjectMember() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/companionObjectMember.kt");
    }

    @TestMetadata("constPropertyReferenceFromMultifileClass.kt")
    public void testConstPropertyReferenceFromMultifileClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/constPropertyReferenceFromMultifileClass.kt");
    }

    @TestMetadata("constructorVararg.kt")
    public void testConstructorVararg() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/constructorVararg.kt");
    }

    @TestMetadata("constructorWithInlineClassParametersInBinaryDependencies.kt")
    public void testConstructorWithInlineClassParametersInBinaryDependencies() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/constructorWithInlineClassParametersInBinaryDependencies.kt");
    }

    @TestMetadata("copySamOnInline.kt")
    public void testCopySamOnInline() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/copySamOnInline.kt");
    }

    @TestMetadata("copySamOnInline2.kt")
    public void testCopySamOnInline2() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/copySamOnInline2.kt");
    }

    @TestMetadata("coroutinesBinary.kt")
    public void testCoroutinesBinary_1_3() throws Exception {
        runTestWithPackageReplacement("compiler/testData/compileKotlinAgainstKotlin/coroutinesBinary.kt", "kotlin.coroutines");
    }

    @TestMetadata("defaultConstructor.kt")
    public void testDefaultConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultConstructor.kt");
    }

    @TestMetadata("defaultLambdaRegeneration.kt")
    public void testDefaultLambdaRegeneration() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration.kt");
    }

    @TestMetadata("defaultLambdaRegeneration2.kt")
    public void testDefaultLambdaRegeneration2() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultLambdaRegeneration2.kt");
    }

    @TestMetadata("defaultWithInlineClassAndReceivers.kt")
    public void testDefaultWithInlineClassAndReceivers() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/defaultWithInlineClassAndReceivers.kt");
    }

    @TestMetadata("delegatedDefault.kt")
    public void testDelegatedDefault() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/delegatedDefault.kt");
    }

    @TestMetadata("delegationAndAnnotations.kt")
    public void testDelegationAndAnnotations() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/delegationAndAnnotations.kt");
    }

    @TestMetadata("doublyNestedClass.kt")
    public void testDoublyNestedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/doublyNestedClass.kt");
    }

    @TestMetadata("enum.kt")
    public void testEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/enum.kt");
    }

    @TestMetadata("expectClassActualTypeAlias.kt")
    public void testExpectClassActualTypeAlias() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/expectClassActualTypeAlias.kt");
    }

    @TestMetadata("inlineClassFromBinaryDependencies.kt")
    public void testInlineClassFromBinaryDependencies() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/inlineClassFromBinaryDependencies.kt");
    }

    @TestMetadata("inlineClassInlineProperty.kt")
    public void testInlineClassInlineProperty() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/inlineClassInlineProperty.kt");
    }

    @TestMetadata("inlineClassesOldMangling.kt")
    public void testInlineClassesOldMangling() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/inlineClassesOldMangling.kt");
    }

    @TestMetadata("inlinedConstants.kt")
    public void testInlinedConstants() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/inlinedConstants.kt");
    }

    @TestMetadata("innerClassConstructor.kt")
    public void testInnerClassConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/innerClassConstructor.kt");
    }

    @TestMetadata("interfaceDelegationAndBridgesProcessing.kt")
    public void testInterfaceDelegationAndBridgesProcessing() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/interfaceDelegationAndBridgesProcessing.kt");
    }

    @TestMetadata("internalSetterOverridden.kt")
    public void testInternalSetterOverridden() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/internalSetterOverridden.kt");
    }

    @TestMetadata("internalWithDefaultArgs.kt")
    public void testInternalWithDefaultArgs() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/internalWithDefaultArgs.kt");
    }

    @TestMetadata("internalWithOtherModuleName.kt")
    public void testInternalWithOtherModuleName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/internalWithOtherModuleName.kt");
    }

    @TestMetadata("jvmField.kt")
    public void testJvmField() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmField.kt");
    }

    @TestMetadata("jvmFieldInAnnotationCompanion.kt")
    public void testJvmFieldInAnnotationCompanion() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmFieldInAnnotationCompanion.kt");
    }

    @TestMetadata("jvmFieldInConstructor.kt")
    public void testJvmFieldInConstructor() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmFieldInConstructor.kt");
    }

    @TestMetadata("jvmFieldInInterfaceCompanion.kt")
    public void testJvmFieldInInterfaceCompanion() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmFieldInInterfaceCompanion.kt");
    }

    @TestMetadata("jvmNames.kt")
    public void testJvmNames() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmNames.kt");
    }

    @TestMetadata("jvmPackageName.kt")
    public void testJvmPackageName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageName.kt");
    }

    @TestMetadata("jvmPackageNameInRootPackage.kt")
    public void testJvmPackageNameInRootPackage() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameInRootPackage.kt");
    }

    @TestMetadata("jvmPackageNameMultifileClass.kt")
    public void testJvmPackageNameMultifileClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameMultifileClass.kt");
    }

    @TestMetadata("jvmPackageNameWithJvmName.kt")
    public void testJvmPackageNameWithJvmName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmPackageNameWithJvmName.kt");
    }

    @TestMetadata("jvmStaticInObject.kt")
    public void testJvmStaticInObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/jvmStaticInObject.kt");
    }

    @TestMetadata("kotlinPropertyAsAnnotationParameter.kt")
    public void testKotlinPropertyAsAnnotationParameter() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kotlinPropertyAsAnnotationParameter.kt");
    }

    @TestMetadata("kt14012.kt")
    public void testKt14012() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kt14012.kt");
    }

    @TestMetadata("kt14012_multi.kt")
    public void testKt14012_multi() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kt14012_multi.kt");
    }

    @TestMetadata("kt21775.kt")
    public void testKt21775() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/kt21775.kt");
    }

    @TestMetadata("metadataForMembersInLocalClassInInitializer.kt")
    public void testMetadataForMembersInLocalClassInInitializer() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/metadataForMembersInLocalClassInInitializer.kt");
    }

    @TestMetadata("multifileClassInlineFunctionAccessingProperty.kt")
    public void testMultifileClassInlineFunctionAccessingProperty() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/multifileClassInlineFunctionAccessingProperty.kt");
    }

    @TestMetadata("multifileClassWithTypealias.kt")
    public void testMultifileClassWithTypealias() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/multifileClassWithTypealias.kt");
    }

    @TestMetadata("nestedClass.kt")
    public void testNestedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedClass.kt");
    }

    @TestMetadata("nestedClassInAnnotationArgument.kt")
    public void testNestedClassInAnnotationArgument() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedClassInAnnotationArgument.kt");
    }

    @TestMetadata("nestedEnum.kt")
    public void testNestedEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedEnum.kt");
    }

    @TestMetadata("nestedFunctionTypeAliasExpansion.kt")
    public void testNestedFunctionTypeAliasExpansion() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedFunctionTypeAliasExpansion.kt");
    }

    @TestMetadata("nestedObject.kt")
    public void testNestedObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedObject.kt");
    }

    @TestMetadata("nestedTypeAliasExpansion.kt")
    public void testNestedTypeAliasExpansion() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/nestedTypeAliasExpansion.kt");
    }

    @TestMetadata("optionalAnnotation.kt")
    public void testOptionalAnnotation() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/optionalAnnotation.kt");
    }

    @TestMetadata("platformTypes.kt")
    public void testPlatformTypes() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/platformTypes.kt");
    }

    @TestMetadata("privateCompanionObjectValInDifferentModule.kt")
    public void testPrivateCompanionObjectValInDifferentModule() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/privateCompanionObjectValInDifferentModule.kt");
    }

    @TestMetadata("privateTopLevelValInDifferentModule.kt")
    public void testPrivateTopLevelValInDifferentModule() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/privateTopLevelValInDifferentModule.kt");
    }

    @TestMetadata("propertyReference.kt")
    public void testPropertyReference() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/propertyReference.kt");
    }

    @TestMetadata("recursiveGeneric.kt")
    public void testRecursiveGeneric() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/recursiveGeneric.kt");
    }

    @TestMetadata("reflectTopLevelFunctionOtherFile.kt")
    public void testReflectTopLevelFunctionOtherFile() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/reflectTopLevelFunctionOtherFile.kt");
    }

    @TestMetadata("sealedClass.kt")
    public void testSealedClass() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/sealedClass.kt");
    }

    @TestMetadata("secondaryConstructors.kt")
    public void testSecondaryConstructors() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/secondaryConstructors.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/simple.kt");
    }

    @TestMetadata("simpleValAnonymousObject.kt")
    public void testSimpleValAnonymousObject() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/simpleValAnonymousObject.kt");
    }

    @TestMetadata("specialBridgesInDependencies.kt")
    public void testSpecialBridgesInDependencies() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/specialBridgesInDependencies.kt");
    }

    @TestMetadata("starImportEnum.kt")
    public void testStarImportEnum() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/starImportEnum.kt");
    }

    @TestMetadata("suspendFunWithDefaultMangling.kt")
    public void testSuspendFunWithDefaultMangling() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/suspendFunWithDefaultMangling.kt");
    }

    @TestMetadata("targetedJvmName.kt")
    public void testTargetedJvmName() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/targetedJvmName.kt");
    }

    @TestMetadata("typeAliasesKt13181.kt")
    public void testTypeAliasesKt13181() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/typeAliasesKt13181.kt");
    }

    @TestMetadata("unsignedTypesInAnnotations.kt")
    public void testUnsignedTypesInAnnotations() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/unsignedTypesInAnnotations.kt");
    }

    @TestMetadata("useDeserializedFunInterface.kt")
    public void testUseDeserializedFunInterface() throws Exception {
        runTest("compiler/testData/compileKotlinAgainstKotlin/useDeserializedFunInterface.kt");
    }

    @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/fir")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Fir extends AbstractFirCompileKotlinAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
        }

        public void testAllFilesPresentInFir() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/fir"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("AnonymousObjectInProperty.kt")
        public void testAnonymousObjectInProperty() throws Exception {
            runTest("compiler/testData/compileKotlinAgainstKotlin/fir/AnonymousObjectInProperty.kt");
        }

        @TestMetadata("ExistingSymbolInFakeOverride.kt")
        public void testExistingSymbolInFakeOverride() throws Exception {
            runTest("compiler/testData/compileKotlinAgainstKotlin/fir/ExistingSymbolInFakeOverride.kt");
        }

        @TestMetadata("LibraryProperty.kt")
        public void testLibraryProperty() throws Exception {
            runTest("compiler/testData/compileKotlinAgainstKotlin/fir/LibraryProperty.kt");
        }
    }

    @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm8 extends AbstractFirCompileKotlinAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
        }

        public void testAllFilesPresentInJvm8() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Defaults extends AbstractFirCompileKotlinAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
            }

            public void testAllFilesPresentInDefaults() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superCall.kt");
            }

            @TestMetadata("superCallFromInterface.kt")
            public void testSuperCallFromInterface() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superCallFromInterface.kt");
            }

            @TestMetadata("superCallFromInterface2.kt")
            public void testSuperCallFromInterface2() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superCallFromInterface2.kt");
            }

            @TestMetadata("superPropAccess.kt")
            public void testSuperPropAccess() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superPropAccess.kt");
            }

            @TestMetadata("superPropAccessFromInterface.kt")
            public void testSuperPropAccessFromInterface() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superPropAccessFromInterface.kt");
            }

            @TestMetadata("superPropAccessFromInterface2.kt")
            public void testSuperPropAccessFromInterface2() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/superPropAccessFromInterface2.kt");
            }

            @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class AllCompatibility extends AbstractFirCompileKotlinAgainstKotlinTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
                }

                public void testAllFilesPresentInAllCompatibility() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
                }

                @TestMetadata("callStackTrace.kt")
                public void testCallStackTrace() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/callStackTrace.kt");
                }

                @TestMetadata("superCall.kt")
                public void testSuperCall() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superCall.kt");
                }

                @TestMetadata("superCallFromInterface.kt")
                public void testSuperCallFromInterface() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superCallFromInterface.kt");
                }

                @TestMetadata("superCallFromInterface2.kt")
                public void testSuperCallFromInterface2() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superCallFromInterface2.kt");
                }

                @TestMetadata("superPropAccess.kt")
                public void testSuperPropAccess() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superPropAccess.kt");
                }

                @TestMetadata("superPropAccessFromInterface.kt")
                public void testSuperPropAccessFromInterface() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superPropAccessFromInterface.kt");
                }

                @TestMetadata("superPropAccessFromInterface2.kt")
                public void testSuperPropAccessFromInterface2() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/superPropAccessFromInterface2.kt");
                }

                @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/delegationBy")
                @TestDataPath("$PROJECT_ROOT")
                @RunWith(JUnit3RunnerWithInners.class)
                public static class DelegationBy extends AbstractFirCompileKotlinAgainstKotlinTest {
                    private void runTest(String testDataFilePath) throws Exception {
                        KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
                    }

                    public void testAllFilesPresentInDelegationBy() throws Exception {
                        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/delegationBy"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
                    }

                    @TestMetadata("simple.kt")
                    public void testSimple() throws Exception {
                        runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/delegationBy/simple.kt");
                    }

                    @TestMetadata("simpleProperty.kt")
                    public void testSimpleProperty() throws Exception {
                        runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/allCompatibility/delegationBy/simpleProperty.kt");
                    }
                }
            }

            @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Interop extends AbstractFirCompileKotlinAgainstKotlinTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
                }

                public void testAllFilesPresentInInterop() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
                }

                @TestMetadata("likeMemberClash.kt")
                public void testLikeMemberClash() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/likeMemberClash.kt");
                }

                @TestMetadata("likeSpecialization.kt")
                public void testLikeSpecialization() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/likeSpecialization.kt");
                }

                @TestMetadata("newAndOldSchemes.kt")
                public void testNewAndOldSchemes() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/newAndOldSchemes.kt");
                }

                @TestMetadata("newAndOldSchemes2.kt")
                public void testNewAndOldSchemes2() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/newAndOldSchemes2.kt");
                }

                @TestMetadata("newAndOldSchemes2Compatibility.kt")
                public void testNewAndOldSchemes2Compatibility() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/newAndOldSchemes2Compatibility.kt");
                }

                @TestMetadata("newAndOldSchemes3.kt")
                public void testNewAndOldSchemes3() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/newAndOldSchemes3.kt");
                }

                @TestMetadata("newSchemeWithJvmDefault.kt")
                public void testNewSchemeWithJvmDefault() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/defaults/interop/newSchemeWithJvmDefault.kt");
                }
            }
        }

        @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Jvm8against6 extends AbstractFirCompileKotlinAgainstKotlinTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
            }

            public void testAllFilesPresentInJvm8against6() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
            }

            @TestMetadata("jdk8Against6.kt")
            public void testJdk8Against6() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/jdk8Against6.kt");
            }

            @TestMetadata("simpleCall.kt")
            public void testSimpleCall() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/simpleCall.kt");
            }

            @TestMetadata("simpleCallWithBigHierarchy.kt")
            public void testSimpleCallWithBigHierarchy() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/simpleCallWithBigHierarchy.kt");
            }

            @TestMetadata("simpleCallWithHierarchy.kt")
            public void testSimpleCallWithHierarchy() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/simpleCallWithHierarchy.kt");
            }

            @TestMetadata("simpleProp.kt")
            public void testSimpleProp() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/simpleProp.kt");
            }

            @TestMetadata("simplePropWithHierarchy.kt")
            public void testSimplePropWithHierarchy() throws Exception {
                runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/simplePropWithHierarchy.kt");
            }

            @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/delegation")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Delegation extends AbstractFirCompileKotlinAgainstKotlinTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
                }

                public void testAllFilesPresentInDelegation() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/delegation"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
                }

                @TestMetadata("diamond.kt")
                public void testDiamond() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/delegation/diamond.kt");
                }

                @TestMetadata("diamond2.kt")
                public void testDiamond2() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/delegation/diamond2.kt");
                }

                @TestMetadata("diamond3.kt")
                public void testDiamond3() throws Exception {
                    runTest("compiler/testData/compileKotlinAgainstKotlin/jvm8/jvm8against6/delegation/diamond3.kt");
                }
            }
        }
    }

    @TestMetadata("compiler/testData/compileKotlinAgainstKotlin/typeAnnotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeAnnotations extends AbstractFirCompileKotlinAgainstKotlinTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTestWithCustomIgnoreDirective(this::doTest, TargetBackend.JVM_IR, testDataFilePath, "// IGNORE_BACKEND_FIR: ");
        }

        public void testAllFilesPresentInTypeAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/compileKotlinAgainstKotlin/typeAnnotations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
        }

        @TestMetadata("implicitReturn.kt")
        public void testImplicitReturn() throws Exception {
            runTest("compiler/testData/compileKotlinAgainstKotlin/typeAnnotations/implicitReturn.kt");
        }
    }
}