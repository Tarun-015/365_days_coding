//Remove Duplicate Characters from a String

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}
