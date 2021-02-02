// !WITH_NEW_INFERENCE
fun foo(f: String.() -> Int) {}
val test = <!INAPPLICABLE_CANDIDATE!>foo<!>(fun () = <!UNRESOLVED_REFERENCE!>length<!>)
