import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            set.add(ch);
        }

        for (char ch : set) {
            result.append(ch);
        }

        System.out.println("Without duplicates: " + result);
    }
}
