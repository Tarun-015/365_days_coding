// Order of Execution in Inheritance
class A {
    static { System.out.println("Static A"); }
    { System.out.println("Init A"); }
    A() { System.out.println("Constructor A"); }
}
class B extends A {
    static { System.out.println("Static B"); }
    { System.out.println("Init B"); }
    B() { System.out.println("Constructor B"); }

    public static void main(String[] args) {
        new B();
    }
}


//  Output:

// Static A
// Static B
// Init A
// Constructor A
// Init B
// Constructor B


//  Static blocks run once per class, then instance init blocks, then constructors.