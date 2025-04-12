// Write a program to print a pattern of double hollow right triangles based on an integer input n. The pattern consists of asterisks (*) and spaces arranged as follows:

// The upper half of the pattern has rows with increasing numbers of stars on the left and the right.
// In the hollow region, spaces replace asterisks except for the outermost boundaries of the triangles.
// The last row is completely filled with asterisks (*).
// Note: Handle invalid inputs gracefully by displaying an appropriate error message, "Shape Not Possible", if the pattern cannot be drawn.

// Input Format

// A single integer n.
// Constraints

// -50 <= n <= 50
// Output Format

// The double hollow right triangle pattern for the given size n.
// Print "Shape Not Possible" if the pattern is not possible.
// Sample Input 0

// 5
// Sample Output 0

// *        *
// **      **
// * *    * *
// *  *  *  *
// **********
// Sample Input 1

// 1
// Sample Output 1

// Shape Not Possible

#include <stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    if (n < 2) {
        printf("Shape Not Possible\n");
        return 0;
    }   
    for (int i = 1; i <= n; i++) {
        // left-Tri
        for (int j = 1; j <= i; j++) {
            
            if (j == 1 || j == i || i == n) {
                printf("*");
            } else {
                printf(" ");
            }
        }

        // mid-tri
        for (int j = 2; j <= 2*(n-i+1)-1; j++) {
            printf(" ");
        }

        // Right Triangle
        for (int j = 1; j <= i; j++) {
            
            if (j == 1 || j == i || i == n) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
