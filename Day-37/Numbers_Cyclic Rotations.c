// Given an integer N, print all cyclic rotations of the number N. A cyclic rotation involves shifting the digit in the one's place to the leftmost, and moving all other digits one place to the right. The rotations continue until the original number is reached again.

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^9
// Output Format

// Print all cyclic rotations of N, one per line, in the order they are obtained by shifting the digit in the one's place to the left. The process stops when the number returns to its original configuration.
// Sample Input 0

// 1234
// Sample Output 0

// 4123
// 3412
// 2341
// 1234
// Sample Input 1

// 100
// Sample Output 1

// 10
// 1
// 100
// Sample Input 2

// 1221
// Sample Output 2

// 1122
// 2112
// 2211
// 1221

#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int a=n;
  int d=0;
  int temp = n;
    while (temp > 0) {
        temp /= 10;
        d++;
    }
  int x=1;
  for(int j=1;j<=d-1;j++){
    x*=10;
  }
  //printf(" %d ",x);
  for(int i=1;i<=d;i++){
    int l =a%10;
    //printf("%d",l);
    a/=10;
    a =l*x+a;
    printf("%d",a);
    printf("\n");
  }
  
    printf("\n");
    return 0;
}