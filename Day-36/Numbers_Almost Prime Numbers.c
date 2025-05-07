// A number is called "almost prime" if it has exactly two prime factors (not necessarily distinct).

// Given an integer N, count how many numbers from 1 to N (inclusive) are almost prime.

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// Print a single integer representing the count of almost prime numbers from 1 to N.
// Sample Input 0

// 10
// Sample Output 0

// 4
// Explanation 0

// The almost prime numbers between 1 and 10 are:

// 4 → (2 × 2)
// 6 → (2 × 3)
// 9 → (3 × 3)
// 10 → (2 × 5)
// Total count = 4

// Sample Input 1

// 20
// Sample Output 1

// 6
// Explanation 1

// The almost prime numbers between 1 and 20 are:

// 4 → (2 × 2)
// 6 → (2 × 3)
// 9 → (3 × 3)
// 10 → (2 × 5)
// 14 → (2 × 7)
// 15 → (3 × 5)
// Total count = 6


#include <stdio.h>
int is_two_prime_factors(int num) {
    int cnt = 0;

    while (num % 2 == 0) {
        num /= 2;
        cnt++;
        if (cnt > 2) return 0;
    }

    for (int i = 3; i*i<=num; i += 2) {
        while (num % i == 0) {
            num /= i;
            cnt++;
            if (cnt > 2) return 0;
        }
    }

    if (num > 1) cnt++;

    return cnt == 2;
}

int main() {
    int n, count = 0;
    scanf("%d", &n);

    for (int i = 4; i <= n; i++) {
        if (is_two_prime_factors(i)) {
            count++;
        }
    }

    printf("%d\n", count);
    return 0;
}   