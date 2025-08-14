// Q1 — Static Method for Utility

// Write a Java program with a static method square(int x) that returns the square of a number. Call it without creating an object

public class StaticSquare {
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println("Square of 5: " + square(5));
    }
}
