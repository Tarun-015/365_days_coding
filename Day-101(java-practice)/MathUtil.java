// Question:
// Create a class MathUtil with a method add() overloaded to handle:

// Two integers

// Three integers

// Two doubles

// Expected Output:

// Sum (2 ints): 30
// Sum (3 ints): 60
// Sum (2 doubles): 11.0

public class MathUtil {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtil mu = new MathUtil();
        System.out.println("Sum (2 ints): " + mu.add(10, 20));
        System.out.println("Sum (3 ints): " + mu.add(10, 20, 30));
        System.out.println("Sum (2 doubles): " + mu.add(5.5, 5.5));
    }
}
