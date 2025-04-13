// Write a program to extract the position of the rightmost set bit of a given integer n. If no set bit exists, the program should print 0.

// Note: Start the position from 1

// Input Format

// A single integer n.
// Constraints

// -2^31 ≤ n < 2^31
// Output Format

// An integer indicating the position of the rightmost set bit in n
// Sample Input 0

// 18
// Sample Output 0

// 2
// Sample Input 1

// 16
// Sample Output 1

// 5

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    if (n==0) {
        printf("0\n");
        return 0;
    }
    int pos = 1; 
    while ((n & 1) == 0) { 
        n >>= 1; 
        pos++;
    }
    printf("%d\n", pos);
    return 0;

}