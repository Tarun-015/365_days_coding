// Aditi is fascinated by special numbers and has learned about Armstrong numbers. She wants to quickly check if a given number is an Armstrong number or not. Write a program to help Aditi to determine if a number is an Armstrong number.

// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

// Input Format

// A single integer n.
// Constraints

// 1 <= n <= 10^9
// Output Format

// Print "YES" if the number is an Armstrong number, otherwise "NO".
// Sample Input 0

// 153
// Sample Output 0

// YES
// Explanation 0

// 153 is a 3-digit number.
// 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
// Since the sum of the cubes of its digits equals the number itself, 153 is an Armstrong number.
// Sample Input 1

// 123
// Sample Output 1

// NO
// Explanation 1

// 123 is a 3-digit number.
// 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36.
// Since the sum of the cubes of its digits does not equal 123, it is not an Armstrong number.


#include <stdio.h>
#include<math.h>

int main() {
  int n;
  scanf("%d",&n);
  int b=n,num=0,digits=0;
  int temp = n;
    while (temp > 0) {
        temp /= 10;
        digits++;
    }
  while(n !=0){
    int last=n%10;
    num = num + pow(last,digits);
    n = n/10;   
  }
  if(num==b){
    printf("YES");
  }
  else{
    printf("NO");
  }
}