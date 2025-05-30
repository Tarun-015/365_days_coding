// Java implementation of the approach
import java.io.*;

class GFG {

    // Function to return the binary
    // equivalent of decimal value N
    static int decimalToBinary(int N)
    {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }

    // Driver code
    public static void main(String[] args)
    {

        int N = 17;
          System.out.println("Decimal - " + N);
          System.out.print("Binary - ");
        System.out.println(decimalToBinary(N));
    }
}

// This code is contributed by ajit.