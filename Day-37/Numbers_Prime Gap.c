// Given an integer N, write a program to find:

// The smallest prime P1 that is strictly greater than N.
// The largest prime P2 that is strictly smaller than N.
// Then, return the absolute difference |P1 - P2|.

// Note: If P1 or P2 does not exist, consider it as 0.

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// A single integer representing the absolute difference between P1 and P2.
// Sample Input 0

// 10
// Sample Output 0

// 4
// Sample Input 1

// 17
// Sample Output 1

// 6


#include <stdio.h>  
#include <stdlib.h>  
#include <stdbool.h>  

bool isPrime(int n) {  
    if (n <= 1) return false;  
    for (int i = 2; i * i <= n; i++) {  
        if (n % i == 0){
          return false;
        }   
    }  
    return true;  
}  

int main() {  
    int n;  
    scanf("%d", &n);  
    int p1 = 0, p2 = 0;  

    // Find P1  
    for (int i = n + 1; ; i++) {  
        if (isPrime(i)) {  
            p1 = i;  
            break;  
        }  
    }  
    // Find P2  
    for (int i = n - 1; i >= 2; i--) {  
        if (isPrime(i)) {  
            p2 = i;  
            break;  
        }  
    }  

    printf("%d\n", abs(p1 - p2));  
    return 0;  
}  