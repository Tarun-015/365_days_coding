//Example 3: Predicate Chaining (and, or, negate)
import java.util.function.Predicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThan10 = n -> n > 10;
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(greaterThan10.and(even).test(12));  // true ( >10 and even )
        System.out.println(greaterThan10.or(even).test(8));    // true ( >10 OR even )
        System.out.println(greaterThan10.negate().test(5));    // true (NOT >10)
    }
}