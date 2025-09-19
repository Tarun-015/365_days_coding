//Example 1: Basic Predicate

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));  // true
        System.out.println(isEven.test(7));   // false
    }
}