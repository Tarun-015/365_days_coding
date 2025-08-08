// 1. private
// Accessible only within the same class.

// Not visible to any other class — not even subclass.

public class A {
    private int age = 21;

    private void show() {
        System.out.println("Private method");
    }
}
// Can access age and show() only inside class A.