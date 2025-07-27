import java.util.Arrays;

public class SortCharacters {
    public static void main(String[] args) {
        String input = "edcba";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        System.out.println("Sorted: " + new String(chars));
    }
}
