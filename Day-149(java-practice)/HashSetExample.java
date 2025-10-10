// Basic HashSet Operations
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored

        System.out.println("HashSet Elements: " + set);

        set.remove("C++");
        System.out.println("After Removal: " + set);

        System.out.println("Contains 'Python'? " + set.contains("Python"));
        System.out.println("Size: " + set.size());
    }
}


//  Concept:
// HashSet stores unique elements only and doesn’t maintain insertion order.
// Internally uses a hash table → O(1) average time for add/search/remove.