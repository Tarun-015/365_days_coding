class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
    void guard() { System.out.println("Dog guards"); }
}

public class CastingDemo {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        a.sound();              // Runtime binding

        Dog d = (Dog) a;        // Downcasting
        d.guard();              // Access child method
    }
}
