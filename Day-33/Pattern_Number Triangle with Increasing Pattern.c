// Write a program to generate a number pattern based on the given rules:

// The pattern consists of n rows.
// Each row starts with a number and increases column-wise.
// Numbers in each column follow a diagonal progression across rows.
// For a given integer n, print the pattern as described.

// Input Format

// A single integer n.
// Constraints

// 1 ≤ n ≤ 50
// Output Format

// n lines, where each line contains numbers separated by a space.
// Sample Input 0

// 5
// Sample Output 0

// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15
// Sample Input 1

// 3
// Sample Output 1

// 1 
// 2 4 
// 3 5 6

#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++){    
    int a=i; 
    int b=n-1;
    for(int j=1;j<=i;j++){ 
        printf("%d ",a);
      a+=b;
      b--;
    }   
    printf("\n");
  }  
}