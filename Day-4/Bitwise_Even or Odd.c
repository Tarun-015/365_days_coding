// Write a program to determine whether a given integer N is even or odd using only bitwise operators.

// The program should not use the modulo (%) operator.

// Input Format

// A single integer N
// Constraints

// -10^5 ≤ N ≤ 10^5
// Output Format

// Print Even if N is an even number.
// Print Odd if N is an odd number.
// Sample Input 0

// 4        
// Sample Output 0

// Even
// Sample Input 1

// 19
// Sample Output 1

// Odd

#include <stdio.h>

int main() {
  int n,bin=0,i=1,rem;
  scanf("%d",&n);
  if(n&1){
    printf("Odd");
  }
  else{
    printf("Even");
  }

    return 0;
}