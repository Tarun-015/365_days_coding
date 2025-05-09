// A number N is called a Supreme Prime if:

// N is a prime number.
// The sum of its digits is also a prime number.
// Given an integer N, write a program to determine whether it is a Supreme Prime or not.

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// Print "YES" if N is a Supreme Prime, otherwise print "NO".
// Sample Input 0

// 23
// Sample Output 0

// YES
// Sample Input 1

// 19
// Sample Output 1

// NO


#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);   
    int f = 0, b = 0;
  if(n==0){
    printf("NO");
    return 0; 
  }
  
    for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                f = 1;
                break;
            }
        }
    //}
    if (f == 0) {  
        int temp = n;
        while (temp > 0) {
            int a = temp % 10;
            b += a;
            temp /= 10;
        }
    } else {
        printf("NO\n");
        return 0;
    }
    int x = 0;
        for (int j = 2; j <= sqrt(b); j++) {
            if (b % j == 0) {
                x = 1;
                break;
            }
        }
    if (x == 0) {
        printf("YES");
    } else {
        printf("NO");
    }

    return 0;
}
