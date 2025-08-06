// Method Overriding – Different Implementation in Child
// Question:
// Create a class Animal with a method speak().
// Override it in Dog and Cat classes to print different sounds.

// Expected Output:


// Dog says: Woof!
// Cat says: Meow!

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat says: Meow!");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.speak();
        a2.speak();
    }
}
