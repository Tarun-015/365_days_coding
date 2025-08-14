// Q2 — Non-Static Method for Greeting

// Create a class Greeter with a non-static method sayHello(String name) that prints "Hello, <name>". Call it using an object.

public class Greeter {
    void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello("Tarun");
    }
}
