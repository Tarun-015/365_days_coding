import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "Anagrams" : "Not Anagrams");
    }
}
