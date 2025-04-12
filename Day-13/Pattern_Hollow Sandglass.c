// Write a program to print a hollow sandglass pattern using asterisks (*).

// The pattern should be formed based on the number of rows n entered by the user.

// The pattern must have the following properties:

// The first and last rows cannot have 2 or more continuous spaces between asterisks (*).
// All intermediate rows should have hollow spaces between the boundary asterisks.
// The pattern should have a symmetric sandglass shape.
// Note: Handle invalid inputs gracefully by displaying an appropriate error message, "Shape Not Possible", if the sandglass cannot be drawn by the given input value.

// Input Format

// A single integer n.
// Constraints

// -100 <= n <= 100
// Output Format

// A symmetric hollow sandglass pattern, for n=5, as described below:
// * * * * *
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// * * * * *
// Print "Shape Not Possible" if the sandglass cannot be drawn.
// Sample Input 0

// 2
// Sample Output 0

// * *
//  *
// * *
// Sample Input 1

// -10
// Sample Output 1

// Shape Not Possible

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    
    if (n < 2) {
        printf("Shape Not Possible\n");
        return 0;
    }
    if(n>=2){
      for(int i=1; i<=n; i++){
        for(int k=2; k<=i; k++){
          printf(" ");
        }
        for(int j=1; j<=n-i+1; j++){
          if(i==1 || j==1 || j==n-i+1){
            printf("* ");
          }
          else{
            printf("  ");
          }
        }
        printf("\n");       
      }
      for(int i=2; i<=n; i++){
        for(int k=1; k<n-i+1; k++){
          printf(" ");
        }
        for(int j=1; j<=i; j++){
          if(j==1 || j==i || i==n){
            printf("* ");
          }
          else{
            printf("  ");
          }
        }
        printf("\n");
      }
    }
  
}
  
   