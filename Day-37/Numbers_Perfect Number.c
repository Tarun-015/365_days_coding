// Samay loves exploring special numbers and recently learned about perfect numbers. He wants to quickly check if a given number is a perfect number or not. Write a program to determine this for him.

// A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).

// Input Format

// A single integer n.
// Constraints

// 1 <= n <= 10^9
// Output Format

// Print "YES" if the number is a perfect number, otherwise "NO".
// Sample Input 0

// 6
// Sample Output 0

// YES
// Explanation 0

// Proper divisors of 6: 1, 2, 3.
// Their sum: 1 + 2 + 3 = 6.
// Since the sum equals 6, it is a perfect number.
// Sample Input 1

// 10
// Sample Output 1

// NO
// Explanation 1

// Proper divisors of 10: 1, 2, 5.
// Their sum: 1 + 2 + 5 = 8.
// Since the sum is not equal to 10, it is not a perfect number.


#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int a=0;
  if(n<0){
    printf("NO");
  }
  //int b=1;
  for(int i=1;i<=n-1;i++){
    if(n%i==0){
      a+=i;
    }
  }
 // printf("%d ",b);
 // printf("%d ",a);
  if(a==n){
    printf("YES");
  }
  else{
    printf("NO");
  }
    return 0;
}