// Remove All Even Numbers from an ArrayList using removeIf()
import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 8, 11, 14, 17, 20));

        System.out.println("Original List: " + list);

        list.removeIf(n -> n % 2 == 0); // Lambda Predicate
        System.out.println("After Removing Even Numbers: " + list);
    }
}