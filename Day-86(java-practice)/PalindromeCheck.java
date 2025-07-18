//Check if a String is a Palindrome (ignoring case and spaces)

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        str = str.replaceAll("\\s+", "").toLowerCase();

        StringBuilder reversed = new StringBuilder(str).reverse();

        if (str.equals(reversed.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
