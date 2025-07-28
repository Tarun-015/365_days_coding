// Remove Duplicates but Keep First Occurrence

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("Without duplicates: " + sb.toString());
    }
}
