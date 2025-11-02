// @Override Annotation

//  Used when a method overrides a parent class method.
// If the parent method name/signature is wrong — compiler throws an error.

// File: OverrideExample.java
class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {     // Correctly overrides
        System.out.println("Display from Child");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}


//  Output:

// Display from Child