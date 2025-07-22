public class OnlyDigitsCheck {
    public static void main(String[] args) {
        String input = "123456";

        boolean onlyDigits = input.matches("\\d+");
        System.out.println(onlyDigits ? "All Digits" : "Contains Non-Digit Characters");
    }
}
