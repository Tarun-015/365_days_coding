// Write a program to determine whether a given integer n is positive or negative using bitwise operators.

// Note: You are not allowed to use comparison operators like <, >, <=, or >=.

// Input Format

// A single integer n.
// Constraints

// −2^31 ≤ n < 2^31
// Output Format

// Print "Positive" if n is positive or zero.
// Print "Negative" if n is negative.
// Sample Input 0

// 100
// Sample Output 0

// Positive
// Sample Input 1

// -100
// Sample Output 1

// Negative

#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int s = n>>31;
  if(s==0){
    printf("Positive");
  }
  else if(s==-1){
    printf("Negative");
  }

    return 0;
}