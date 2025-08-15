//Group Words by Their First Letter

import java.util.*;
import java.util.stream.*;

public class GroupWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry", "apricot");

        Map<Character, List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(word -> word.charAt(0)));

        grouped.forEach((letter, list) -> 
            System.out.println(letter + " : " + list));
    }
}

// o/p:
// a : [apple, avocado, apricot]
// b : [banana, blueberry]
// c : [cherry]