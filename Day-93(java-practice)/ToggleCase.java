// Toggle Case of Each Character in a String

public class ToggleCase {
    public static void main(String[] args) {
        String input = "Java iS FuN!";
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }

        System.out.println("Toggled case: " + result.toString());
    }
}
