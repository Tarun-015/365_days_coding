// Implement a function find_unique_digit_product(n) that returns the product of the unique digits present in the given number n. The product should only consider distinct digits, ignoring any repeating digits.

// Function Signature

// int find_unique_digit_product(int n);
// Input Format

// There is no input handling required in the function.
// The function takes a single integer n as the parameter.
// Constraints

// 0 ≤ n ≤ 10^9
// Output Format

// Do not print anything inside the function.
// The function must return the unique digits product as an integer.
// Sample Input 0

// 123
// Sample Output 0

// 6
// Sample Input 1

// 9987
// Sample Output 1

// 504


#include <stdio.h>

int find_unique_digit_product(int n) {
  //int l;
  int a=n/100;
   // printf("%d",a);
  int i=1;
  int temp=n;
  while(temp>0){
    int l=temp%10;
    if(l!=a){
      i*=l;
    }
    temp/=10;
  }
  return i;
}

int main() {
    int n;
    scanf("%d", &n);
    printf("%d\n", find_unique_digit_product(n));
    return 0;
}



