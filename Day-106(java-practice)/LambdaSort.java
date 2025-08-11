//Sorting a List using Lambda

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tarun", "Ananya", "Ravi", "Kiran", "Priya");

        // Sort in ascending order using lambda
        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted Names:");
        names.forEach(name -> System.out.println(name));
    }
}
