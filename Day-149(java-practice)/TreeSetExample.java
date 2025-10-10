// TreeSet Example (Sorted Order)
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(10);
        ts.add(40);
        ts.add(20);

        System.out.println("TreeSet (Sorted): " + ts);

        System.out.println("First Element: " + ts.first());
        System.out.println("Last Element: " + ts.last());

        ts.remove(40);
        System.out.println("After Removing 40: " + ts);
    }
}


//  Concept:
// TreeSet stores elements in ascending sorted order (uses Red-Black Tree).
// Search, insert, delete = O(log n) time.