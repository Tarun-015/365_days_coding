// LinkedHashMap — Maintains Insertion Order
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "Red");
        lhm.put(2, "Green");
        lhm.put(3, "Blue");
        lhm.put(4, "Yellow");

        System.out.println("LinkedHashMap Elements (Insertion Order): " + lhm);

        lhm.remove(2);
        System.out.println("After Removing Key 2: " + lhm);
    }
}


// Concept:
// LinkedHashMap preserves insertion order unlike HashMap.