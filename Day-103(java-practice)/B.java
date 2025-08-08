// Default (no keyword written)
// Accessible within the same package only.

// Also called package-private.

class B {
    int rollNo = 5;  // default
    void display() {  // default
        System.out.println("Default method");
    }
}
// Can access rollNo and display() from any class in the same package.