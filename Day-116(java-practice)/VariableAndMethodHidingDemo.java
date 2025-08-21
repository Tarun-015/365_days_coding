// Java Program (Variable Hiding + Method Hiding)

class Parent {
    String name = "Parent Variable";

    static void display() {
        System.out.println("Parent's static display()");
    }
}

class Child extends Parent {
    String name = "Child Variable";

    static void display() {
        System.out.println("Child's static display()");
    }
}

public class VariableAndMethodHidingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        // 🔹 Variable Hiding
        System.out.println("Parent reference: " + p.name);   // Parent Variable
        System.out.println("Child reference: " + c.name);    // Child Variable
        System.out.println("Parent ref to Child object: " + pc.name); // Parent Variable

        // 🔹 Method Hiding
        p.display();   // Parent's static display()
        c.display();   // Child's static display()
        pc.display();  // Parent's static display() -> method hiding
    }
}


// o/p :
// Parent reference: Parent Variable
// Child reference: Child Variable
// Parent ref to Child object: Parent Variable
// Parent's static display()
// Child's static display()
// Parent's static display()

