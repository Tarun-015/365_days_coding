// Write a program to print a butterfly pattern based on an integer input n. The pattern should consist of stars (*) and spaces arranged as follows:

// The upper half of the butterfly contains rows where the number of stars increases, and the spaces decrease symmetrically.
// The lower half is a mirror image of the upper half.
// Note: Handle invalid inputs gracefully by displaying an appropriate error message, "Shape Not Possible", if the pattern cannot be drawn.

// Input Format

// A single integer n.
// Constraints

// -50 <= n <= 50
// Output Format

// The butterfly pattern for the given size n.
// Print "Shape Not Possible" if the pattern is not possible.
// Sample Input 0

// 5
// Sample Output 0

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// Sample Input 1

// -5
// Sample Output 1

// Shape Not Possible/

#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    
    if (n <= 1) {
        printf("Shape Not Possible\n");
        return 0;
    }

    //Upper half 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        
        for (int j = 1; j <= 2 * (n - i); j++) {
            printf(" ");
        }
        
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        
        printf("\n");
    }
    
    //Lower half
    for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        
        for (int j = 1; j <= 2 * (n - i); j++) {
            printf(" ");
        }
        
        for (int j = 1; j <= i; j++) {
            printf("*");
        }
        
        printf("\n");
    }
    
    return 0;
}

