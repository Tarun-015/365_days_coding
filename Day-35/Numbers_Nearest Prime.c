// You are given an integer N. Your task is to find the nearest prime number to N.

// If N itself is prime, return N.
// If there are two prime numbers at the same minimum distance from N, return the smaller one.
// Input Format

// A single integer N
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// Print the nearest prime number to N.
// Sample Input 0

// 13
// Sample Output 0

// 13
// Sample Input 1

// 8
// Sample Output 1

// 7

#include <stdio.h>
#include <math.h>


int isPrime(int n) {
    if (n <= 1) return 0;  
    if (n == 2) return 1;  
    if (n % 2 == 0) return 0;  
    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) return 0;  
    }
    return 1; 
}


int nearestPrime(int N) {
    if (isPrime(N)) {
        return N; 
    }

    int lower = N - 1, upper = N + 1;

    // Search for the nearest prime both downwards and upwards
    while (1) {
        if (lower > 1 && isPrime(lower)) {
            return lower;  // Return the lower prime if found
        }
        if (isPrime(upper)) {
            return upper;  // Return the upper prime if found
        }
        lower--;  // Move downwards
        upper++;  // Move upwards
    }
}

int main() {
    int N;
    scanf("%d", &N);      
    printf("%d\n", nearestPrime(N)); 
    return 0;
}
