// Sorting Custom Objects using Comparator
import java.util.*;

class Product {
    int price;
    String name;

    Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(900, "Laptop"));
        list.add(new Product(500, "Keyboard"));
        list.add(new Product(1500, "Monitor"));

        Comparator<Product> byPrice = (p1, p2) -> p1.price - p2.price;
        Collections.sort(list, byPrice);

        System.out.println("Sorted by Price: " + list);
    }
}


// 🧠 Concept:
// Comparator is used when you want different sorting logics without modifying the class.
// You can even use Lambda Expressions for simplicity.