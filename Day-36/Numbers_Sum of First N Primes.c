// Given an integer N, calculate the sum of the first N prime numbers.

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^4
// Output Format

// Print a single integer representing the sum of the first N prime numbers.
// Sample Input 0

// 4
// Sample Output 0

// 17
// Sample Input 1

// 5
// Sample Output 1

// 28

#include <stdio.h>

int main() {
  int n, count = 0, num = 2, i;
  scanf("%d", &n);
  int a=0;
    while (count < n) {
        int is_prime = 1;   
        for (i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                is_prime = 0; 
                break;
            }
        }

        if (is_prime) {
            count++;         
          a = a+num;
        }
        num++;       
    }
  printf("%d",a);
  
    return 0;
}
