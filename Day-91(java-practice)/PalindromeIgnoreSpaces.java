public class PalindromeIgnoreSpaces {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        str = str.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(reversed) ? "Palindrome" : "Not Palindrome");
    }
}
