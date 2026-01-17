interface Showable {
    void display();

    default void greet() {
        System.out.println("Hello from default method");
    }

    static void info() {
        System.out.println("Static method inside interface");
    }
}

public class Demo implements Showable {
    public void display() {
        System.out.println("Display implemented");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        d.greet();          // default method
        Showable.info();    // static method
    }
}
