// Question 2 (Compile-Time Polymorphism / Overloading)

// Create a class Printer that has two print() methods:

// One accepts an int and prints it.

// Another accepts a String and prints it.
// Call both from the main method.



class Printer {
    void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    void print(String text) {
        System.out.println("Printing string: " + text);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Hello Java");
    }
}
