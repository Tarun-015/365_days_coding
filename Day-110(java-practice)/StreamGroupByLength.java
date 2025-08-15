// Group words by their length

import java.util.*;
import java.util.stream.*;

public class StreamGroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "java", "world", "hi");
        Map<Integer, List<String>> grouped = words.stream()
                                                  .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
