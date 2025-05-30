// Write a program to generate a number pattern with n rows based on the following rules:

// The pattern consists of n rows.
// Each row contains a series of odd numbers that follow a sequential order.
// Each row has odd numbered columns with numbers which too increases sequentially.
// The middle column of each row consists of the summation of the odd numbers in that row.
// The numbers in each row are separated by a single space.
// For a given integer n, print the pattern as described.

// Input Format

// A single integer n.
// Constraints

// 1 ≤ n ≤ 50
// Output Format

// n lines, where each line contains numbers separated by a space.
// Sample Input 0

// 3
// Sample Output 0

//     1
//   3 8 5 
// 7 9 40 11 13
// Sample Input 1

// 5
// Sample Output 1

//         1
//       3 8 5 
//     7 9 40 11 13 
//   15 17 19 120 21 23 25 
// 27 29 31 33 272 35 37 39 41 

#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int a=1;
  for(int i=1;i<=n;i++){
    for(int j=2;j<=n-i+1;j++){
      printf("  ");
    }
    for(int k=1;k<=2*i-1;k++){
      
      if(k>1 && k<2*i-1 && k==i){
        printf("%d ",((a-2)+(a))*(k-1));
      }
      else{
        printf("%d ",a);
        a += 2;
      }
    }
    printf("\n");
  }
  return 0;

    
}