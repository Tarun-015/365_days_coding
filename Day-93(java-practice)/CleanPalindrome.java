// Check if a String is a Palindrome (Ignoring Non-Alphabetic Characters)

public class CleanPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String clean = input.replaceAll("[^A-Za-z]", "").toLowerCase();

        String reverse = new StringBuilder(clean).reverse().toString();
        System.out.println(clean.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
