// Write a program to print the word INNOVATION in a stylized pattern using asterisks and spaces, based on a specific design. The number of rows for each letter will depend on the user-provided input n. Each letter in the word "INNOVATION" will follow a predefined pattern of rows and columns as shown below.

// image

// For a given odd integer n, print the pattern as described.

// Note: Leave two spaces between each letters in the word.

// Input Format

// A single odd integer n
// Constraints

// 5 ≤ n ≤ 50
// Output Format

// The word INNOVATION printed in n rows, with 2 spaces between each letters.
// Sample Input 0

// 7
// Sample Output 0

// *******  *     *  *     *   *****   *           *    *****   *******  *******   *****   *     *  
//    *     **    *  **    *  *     *   *         *    *     *     *        *     *     *  **    *  
//    *     * *   *  * *   *  *     *    *       *     *     *     *        *     *     *  * *   *  
//    *     *  *  *  *  *  *  *     *     *     *      *******     *        *     *     *  *  *  *  
//    *     *   * *  *   * *  *     *      *   *       *     *     *        *     *     *  *   * *  
//    *     *    **  *    **  *     *       * *        *     *     *        *     *     *  *    **  
// *******  *     *  *     *   *****         *         *     *     *     *******   *****   *     *  
// Sample Input 1

// 5
// Sample Output 1

// *****  *   *  *   *   ***   *       *    ***   *****  *****   ***   *   *  
//   *    **  *  **  *  *   *   *     *    *   *    *      *    *   *  **  *  
//   *    * * *  * * *  *   *    *   *     *****    *      *    *   *  * * *  
//   *    *  **  *  **  *   *     * *      *   *    *      *    *   *  *  **  
// *****  *   *  *   *   ***       *       *   *    *    *****   ***   *   *

#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);
    for(int i=0; i<=n-1; i++){
        // for i-pattern
        for(int j=0; j<=n-1; j++){
            if(i==0 || j==n/2 || i==n-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for n-pattern
        for(int j=0; j<=n-1; j++){
            if(j==0 || j==n-1 || i==j){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for n-pattern
        for(int j=0; j<=n-1; j++){
            if(j==0 || j==n-1 || i==j){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for o-pattern
        for(int j=0; j<=n-1; j++){
            if(((j==0 || j==n-1) && i!=0 && i!=n-1) || (i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1)){
                printf("*");
            }
            
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for v-pattern
        for(int j=0; j<=n-1; j++){
            if(i==j){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int j=1; j<=n-1; j++){
            if(i+j==n-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=3; k++){
            printf(" ");
        }
        
        // for a-pattern
        for(int j=0; j<=n-1; j++){
            if(((j==0 || j==n-1) && (i!=0)) || (i==0 && j!=0 && j!=n-1) || i==n/2){
                printf("*");
            }
            
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for t-pattern
        for(int j=0; j<=n-1; j++){
            if(i==0 || j==n/2){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for i-pattern
        for(int j=0; j<=n-1; j++){
            if(i==0 || j==n/2 || i==n-1){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for o-pattern
        for(int j=0; j<=n-1; j++){
            if(((j==0 || j==n-1) && i!=0 && i!=n-1) || (i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1)){
                printf("*");
            }
            
            else{
                printf(" ");
            }
        }
        for(int k=1; k<=2; k++){
            printf(" ");
        }
        
        // for n-pattern
        for(int j=0; j<=n-1; j++){
            if(j==0 || j==n-1 || i==j){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
        
    }
    return 0;
}