// Using Collections.frequency(), disjoint(), and copy()
import java.util.*;

public class CollectionsAdvanced {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        List<String> list2 = Arrays.asList("Go", "Rust");

        System.out.println("List 1: " + list1);
        System.out.println("Frequency of 'Java': " + Collections.frequency(list1, "Java"));
        System.out.println("Are both lists disjoint? " + Collections.disjoint(list1, list2));

        List<String> copyList = new ArrayList<>(Arrays.asList("","","","",""));
        Collections.copy(copyList, list1);
        System.out.println("Copied List: " + copyList);
    }
}


// 🧠 Concept:

// frequency() → Counts how often an element occurs

// disjoint() → Checks if two collections share no elements

// copy() → Copies elements from one list to another (destination must be same size or larger)