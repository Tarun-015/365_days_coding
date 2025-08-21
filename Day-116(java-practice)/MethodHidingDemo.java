// Question 2: Method Hiding

// Problem:
// // Create a Parent class with a static method show() and a Child class with the same method. Show how method hiding works when calling with different references.

class Parent {
    static void show() {
        System.out.println("Parent's static show()");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child's static show()");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.show();   // Parent's static show()
        c.show();   // Child's static show()
        pc.show();  // Parent's static show() -> Method hiding
    }
}
