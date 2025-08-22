// Question 1 (Compile-Time Polymorphism / Overloading)

// Write a Java program with a class Calculator that has multiple add() methods to handle:

// Two integers

// Two doubles

// Three integers

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(10, 20));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
    }
}
