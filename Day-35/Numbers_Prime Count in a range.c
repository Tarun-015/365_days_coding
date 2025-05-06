// Given two integers L and R, count the number of prime numbers in the range [L, R] (inclusive) and print all the prime numbers in this range.

// Input Format

// The first and only line contains two integers L and R.
// Constraints

// 1 ≤ L ≤ R ≤ 10^6
// Output Format

// Print the output in two lines:
// Print all the prime numbers in ascending order, separated by spaces.
// Print the count of prime numbers in the range [L, R].
// Sample Input 0

// 10 20
// Sample Output 0

// 11 13 17 19
// 4
// Sample Input 1

// 90 96
// Sample Output 1

// 0

#include <stdio.h>

int main() {
    int L, R;
    scanf("%d %d", &L, &R);
    int count = 0;
    for (int i = L; i <= R; i++) {
        if (i < 2){
          continue;
        } 
        int isPrime = 1; 
        for (int j = 2; j * j <= i; j++) { 
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }
        if (isPrime) {
            printf("%d ", i);
            count++;
        }
    }
    if (count == 0) {
        printf("0");
    } else {
        printf("\n%d", count);
    }

    return 0;
}

