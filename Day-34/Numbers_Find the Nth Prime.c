// Given an integer n, write a program to calculate the n-th prime number, starting from 1.

// Input Format

// A single integer 𝑛.
// Constraints

// 1 <= n <=104
// Output Format

// Print the n-th prime number.
// Sample Input 0

// 6
// Sample Output 0

// 13
// Explanation 0

// 13 is the 6th prime number.

// Sample Input 1

// 12
// Sample Output 1

// 37

#include <stdio.h>

int main() {
   int n;
  int num = 2;
  scanf("%d", &n);
  int count=0;
   while (count < n) {
     int is_prime = 1; 
      for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                is_prime = 0; 
                break;
            }
        }
      if (is_prime) {
            count++;
        }
        
       num++; 
    }

   printf("%d",num-1);
    return 0;
}
