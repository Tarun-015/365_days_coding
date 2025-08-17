// ExceptionTest.java
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayChecker checker = new ArrayChecker(arr);

        // Try-catch block
        try {
            checker.checkForOddNumbers();
        } catch (OddNumberException e) {
            System.out.println(e); // Calls overridden toString()
        }
    }
}



class OddNumberException extends Exception {
    @Override
    public String toString() {
        return "Odd number found";
    }
}

// ArrayChecker.java
class ArrayChecker {
    private int[] numArr;

    // Constructor
    public ArrayChecker(int[] numArr) {
        this.numArr = numArr;
    }

    // Method to check for odd numbers
    public void checkForOddNumbers() throws OddNumberException {
        for (int num : numArr) {
            if (num % 2 != 0) {
                throw new OddNumberException();
            }
        }
        System.out.println("No odd numbers found");
    }
}