// Hashtable — Thread Safe Map
import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "India");
        ht.put(2, "USA");
        ht.put(3, "UK");
        ht.put(4, "Japan");

        System.out.println("Hashtable Elements: " + ht);

        ht.remove(3);
        System.out.println("After Removal: " + ht);

        System.out.println("Contains Key 2? " + ht.containsKey(2));
    }
}


// Concept:
// Hashtable is synchronized (thread-safe) but slower than HashMap.
// It doesn’t allow null keys or values.