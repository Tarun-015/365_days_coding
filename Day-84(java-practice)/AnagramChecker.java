// File: AnagramChecker.java
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        else
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
    }
}
