// LinkedHashSet Example (Maintains Insertion Order)
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Ravi");
        lhs.add("Sita");
        lhs.add("Amit");
        lhs.add("Ravi"); // duplicate ignored

        System.out.println("LinkedHashSet Elements: " + lhs);
    }
}


//  Concept:
// LinkedHashSet maintains insertion order, unlike HashSet.
// Internally: Linked list + Hash table.