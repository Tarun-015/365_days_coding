// Demonstrate Basic Operations of a LinkedList
import java.util.*;

public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Tarun");
        list.add("Karan");
        list.add("Aditi");
        list.addFirst("Meera");
        list.addLast("Rohit");

        System.out.println("LinkedList Elements: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After Removing First & Last: " + list);

        System.out.println("Get First Element: " + list.getFirst());
        System.out.println("Get Last Element: " + list.getLast());
    }
}


// Concept:
// LinkedList maintains insertion order and allows fast insertion/deletion compared to ArrayList.