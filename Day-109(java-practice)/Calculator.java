// Q3 — Static + Non-Static Together

// Create a class Calculator that has:

// A static method add(int a, int b) returning the sum.

// A non-static method multiply(int a, int b) returning the product.
// // Call both in the main method.

public class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(3, 4));

        Calculator calc = new Calculator();
        System.out.println("Product: " + calc.multiply(3, 4));
    }
}
