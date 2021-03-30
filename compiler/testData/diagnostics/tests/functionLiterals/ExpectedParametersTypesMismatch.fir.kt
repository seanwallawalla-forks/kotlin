// !WITH_NEW_INFERENCE
package a

fun foo0(f: () -> String) = f
fun foo1(f: (Int) -> String) = f
fun foo2(f: (Int, String) -> String) = f

fun test1() {
    foo0 {
        ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo0<!> {
        s: String-> ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo0<!> {
        <!CANNOT_INFER_PARAMETER_TYPE!>x<!>, <!CANNOT_INFER_PARAMETER_TYPE!>y<!> -> ""
    }

    foo1 {
        ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo1<!> {
        s: String -> ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo1<!> {
        x, <!CANNOT_INFER_PARAMETER_TYPE!>y<!> -> ""
    }
    foo1 {
        -> 42
    }


    <!INAPPLICABLE_CANDIDATE!>foo2<!> {
        ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo2<!> {
        s: String -> ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo2<!> {
        x -> ""
    }
    <!INAPPLICABLE_CANDIDATE!>foo2<!> {
         -> 42
    }
}
