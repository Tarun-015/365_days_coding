import java.util.*;

// Taxable interface
interface Taxable {
    public abstract double calculateTax();
}

// Product class
class Product implements Taxable {
    protected String name;
    protected double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to calculate tax (1% of price)
    @Override
    public double calculateTax() {
        return 0.01 * price;
    }
}

// Electronics class (child of Product)
class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

// Book class (child of Product)
class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }
}

// Test class
class Test {

    // Method to find max tax in list
    public static double findMaxTax(List<? extends Product> list) {
        double maxTax = 0;
        for (Product p : list) {
            double tax = p.calculateTax();
            if (tax > maxTax) {
                maxTax = tax;
            }
        }
        return maxTax;
    }

    // Main method
    public static void main(String[] args) {
        // Create Electronics objects
        Electronics e1 = new Electronics("Laptop", 50000);
        Electronics e2 = new Electronics("Smartphone", 30000);

        // Create Book objects
        Book b1 = new Book("Java Programming", 800);
        Book b2 = new Book("Data Structures", 1200);

        // Store in lists
        List<Electronics> eList = new ArrayList<>();
        eList.add(e1);
        eList.add(e2);

        List<Book> bList = new ArrayList<>();
        bList.add(b1);
        bList.add(b2);

        // Find max tax in both lists
        double maxETax = findMaxTax(eList);
        double maxBTax = findMaxTax(bList);

        // Print results
        System.out.println("Highest tax among Electronics: " + maxETax);
        System.out.println("Highest tax among Books: " + maxBTax);
    }
}
