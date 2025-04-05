// Write a program to find the maximum of two integers a and b without using any comparison operators (<, >, <=, >=) and if-else at any stage in the program. Use only bitwise operators and logical operators to determine which number is larger.

// Input Format

// Two space-separated integers a and b.
// Constraints

// −10^9 ≤ a,b ≤ 10^9
// Output Format

// Print the larger of the two integers.
// Sample Input 0

// 5 3
// Sample Output 0

// 5
// Sample Input 1

// -7 2
// Sample Output 1

// 2

#include <stdio.h>

int main() {
 
  int a,b;
  scanf("%d %d",&a,&b);
  int n = a -((a-b) * (((a-b)>>31)&1));
  printf("%d",n);

  return 0;
}