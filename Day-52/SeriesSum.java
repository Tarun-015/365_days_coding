// Write a program to find the sum of the following series up to n terms.
// 12 + ( 12 + 22 ) + ( 12 + 22 + 32 ) + ......... + ( 12 + 22 + .... + n2 )
import java.util.*;
public class SeriesSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//Fill your code here
    int sum = 0;

        // Loop through each term from 1 to n
        for (int i = 1; i <= n; i++) {
            // For each term, sum up the squares from 12 to i^2
            for (int j = 1; j <= i; j++) {
                sum += j * j;
            }
        }
System.out.println(sum);
    sc.close();
  }
}