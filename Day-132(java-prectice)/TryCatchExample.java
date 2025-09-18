//Example 1: Basic try-catch
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;   // ArithmeticException
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        }
    }
}