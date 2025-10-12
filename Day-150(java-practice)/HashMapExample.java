// Basic HashMap Operations
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "SQL");

        System.out.println("HashMap Elements: " + map);

        System.out.println("Get Value of Key 2: " + map.get(2));

        map.remove(3);
        System.out.println("After Removing Key 3: " + map);

        System.out.println("Contains Key 1? " + map.containsKey(1));
        System.out.println("Contains Value 'SQL'? " + map.containsValue("SQL"));
    }
}


//  Concept:
// HashMap stores unique keys, values can duplicate.
// Uses hashing, no guaranteed order of keys.