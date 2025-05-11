// An Automorphic Number is a number whose square ends with the same digits as the number itself.

// Write a program to check if a given number N is Automorphic or not.

// Input Format

// A single integer N
// Constraints

// 0 ≤ N ≤ 10^6
// Output Format

// Print "[N] is automorphic" if N is an Automorphic number.
// Print "[N] is not automorphic" otherwise.
// Sample Input 0

// 25
// Sample Output 0

// 25 is automorphic
// Explanation 0

// 25² = 625, and the last two digits of 625 are 25, which are the same as the number itself.
// Sample Input 1

// 13
// Sample Output 1

// 13 is not automorphic
// Explanation 1

// 13² = 169, and the last two digits of 169 are 69, which are different from 13.


#include <stdio.h>
#include <math.h>

int main() {
    int n;
    scanf("%d", &n);

    // Calculate the square of n
    int a = pow(n, 2);

    // Count the number of digits in n
    int temp = n;
    int num_digits = 0;
    while (temp > 0) {
        num_digits++;
        temp /= 10;
    }

    // Extract the last digits of the square that match the number of digits in n
    int last_digits = a % (int)pow(10, num_digits);

    // Check if the last digits of the square match n
    if (last_digits == n) {
        printf("%d is automorphic", n);
    } else {
        printf("%d is not automorphic", n);
    }

    return 0;
}

