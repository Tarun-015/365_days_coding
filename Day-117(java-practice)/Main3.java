// Question 3 (Run-Time Polymorphism / Overriding)

// Create a parent class Animal with a method makeSound().

// Dog overrides it to print "Woof".

// Cat overrides it to print "Meow".
// Demonstrate overriding by creating parent references pointing to child objects.


class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat(); // Upcasting

        a1.makeSound(); // Woof
        a2.makeSound(); // Meow
    }
}
