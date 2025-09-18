//Example 2: try-catch-finally
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range: " + e);
        } finally {
            System.out.println("Finally block always executes!");
        }
    }
}