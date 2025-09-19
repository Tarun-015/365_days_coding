//Example 2: Predicate with String

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> startsWithP = str -> str.startsWith("P");

        System.out.println(startsWithP.test("PWIOI")); // true
        System.out.println(startsWithP.test("Java"));  // false
    }
}