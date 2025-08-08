// protected
// Accessible within the same package AND

// // In subclass even if in different package (via inheritance).

class C {
    protected String name = "Tarun";

    protected void sayHi() {
        System.out.println("Hi from protected method");
    }
}
//Access allowed in same package
// Also accessible in subclass from different package using inheritance.