// Given an integer N, write a program to count the number of twin prime pairs that exist in the range [1, N] (inclusive).

// A twin prime pair is defined as two prime numbers (p, q) where:

// p and q are both prime numbers.
// q = p + 2, i.e., the two primes differ by exactly 2.
// (p, q) and (q, p) should be counted as the same pair, so you should only count one of them.
// Input Format

// A single integer N
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// A single integer representing the count of unique twin prime pairs in the range [1, N].
// Sample Input 0

// 10
// Sample Output 0

// 2
// Sample Input 1

// 20
// Sample Output 1

// 4



#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int prev_prime = 0, count = 0;  

    for (int i = 2; i <= n; i++) {
        int isPrime = 1;

        for (int j = 2; j * j <= i; j++) { 
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime) {
            if (prev_prime != 0 && i - prev_prime == 2) {
                count++; 
            }
            prev_prime = i;  
        }
    }

    printf("%d\n", count);
    return 0;
}

       
   