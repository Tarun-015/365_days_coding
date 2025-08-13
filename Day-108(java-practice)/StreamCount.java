//  Count number of strings starting with 'A'

import java.util.*;
import java.util.stream.*;

public class StreamCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Tarun", "Anil", "Raj");
        long count = names.stream()
                          .filter(name -> name.startsWith("A"))
                          .count();
        System.out.println(count);
    }
}
