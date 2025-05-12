// An Evil Number is a number that has an even number of 1s in its binary representation.

// Write a function is_evil_number(n) that returns 1 if the number n is an Evil Number and 0 otherwise.

// Function Signature

// int is_evil_number(int n);
// Input Format

// There is no input handling required in the function.
// The function takes a single integer n as the parameter.
// Constraints

// 1 ≤ n ≤ 10^6
// Output Format

// The function should return 1 if n is an Evil Number.
// Otherwise, return 0.
// Do not print anything inside the function.
// Sample Input 0

// 9
// Sample Output 0

// 1
// Explanation 0

// 1001 (Two 1s → Even count)

// Sample Input 1

// 7
// Sample Output 1

// 0
// Explanation 1

// 111 (Three 1s → Odd count)


#include <stdio.h>

void print_binary(int n) {
    if (n == 0) {
      printf("0");
        return;
    }
    int x=0;
    int mask = 1 << 30; 
    int started = 0; 
    for (int i = 30; i >= 0; i--) {
        if (n & mask) { 
            started = 1; 
            //printf("1");
          x++;
        } else if (started) {
           // printf("0");
        }
        mask >>= 1; 
    }

if(x%2==0){
  printf("1");
}
else{
  printf("0");
}
}
int main() {
    int num;
    scanf("%d", &num);

   
    print_binary(num);
    return 0;
}
