// TreeMap — Sorted by Key
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(3, "Banana");
        tm.put(1, "Apple");
        tm.put(4, "Mango");
        tm.put(2, "Orange");

        System.out.println("TreeMap (Sorted by Keys): " + tm);

        System.out.println("First Entry: " + tm.firstEntry());
        System.out.println("Last Entry: " + tm.lastEntry());
    }
}


//  Concept:
// TreeMap sorts keys in natural order (ascending).
// Internally uses a Red-Black Tree.