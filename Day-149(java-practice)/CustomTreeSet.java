// Custom Sorting in TreeSet
import java.util.*;

public class CustomTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("Apple");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Orange");

        System.out.println("TreeSet (Reverse Order): " + ts);
    }
}


//  Concept:
// TreeSet can use a custom comparator for user-defined sorting — here we sort in descending order.