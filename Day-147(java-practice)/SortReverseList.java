// Sort and Reverse an ArrayList of Names
import java.util.*;

public class SortReverseList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tarun");
        names.add("Karan");
        names.add("Meera");
        names.add("Aditi");
        names.add("Rohit");

        System.out.println("Original List: " + names);

        Collections.sort(names);
        System.out.println("Sorted List: " + names);

        Collections.reverse(names);
        System.out.println("Reversed List: " + names);
    }
}