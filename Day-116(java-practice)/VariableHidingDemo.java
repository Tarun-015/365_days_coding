// Question 1: Variable Hiding

// Problem:
// Create a Parent class with a variable name and a Child class that also declares a variable name. Show how variable hiding works by creating objects of both classes and printing the values.

class Parent {
    String name = "Parent Name";
}

class Child extends Parent {
    String name = "Child Name";
}

public class VariableHidingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        System.out.println("Parent reference: " + p.name);   // Parent Name
        System.out.println("Child reference: " + c.name);    // Child Name
        System.out.println("Parent ref to Child object: " + pc.name); // Parent Name (hiding)
    }
}
