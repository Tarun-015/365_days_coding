// Question:
// Create a parent class Parent with a method show() and overload it in the same class with a parameter.
// Override the no-argument show() in Child class.
// Write a program that demonstrates compile-time binding for overloading and runtime binding for overriding.

// Expected Output:

// Parent Show
// Parent Show with param: 10
// Child Show
// Parent Show with param: 20


class Parent {
    public void show() {
        System.out.println("Parent Show");
    }

    public void show(int x) {
        System.out.println("Parent Show with param: " + x);
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child Show");
    }
}

public class OverloadOverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();           // Parent Show
        p.show(10);         // Parent Show with param: 10

        Parent ref = new Child();
        ref.show();         // Child Show (runtime overriding)
        ref.show(20);       // Parent Show with param: 20 (compile-time overloading)
    }
}
