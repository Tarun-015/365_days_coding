//Example 4: Predicate with Collection
import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Prem", "Mohan");

        Predicate<String> nameStartsWithP = s -> s.startsWith("P");

        for (String name : names) {
            if (nameStartsWithP.test(name)) {
                System.out.println(name);
            }
        }
    }
}