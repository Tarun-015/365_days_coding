// A Smith number is a composite number where the sum of its digits is equal to the sum of the digits of its prime factors (excluding the number itself).

// Write a function is_smith_number(n) that returns 1 if the given number n is a Smith number, otherwise returns 0.

// Function Signature

// int is_smith_number(int n);
// Input Format

// There is no input handling required in the function.
// The function takes a single integer n as the parameter.
// Constraints

// 1 ≤ n ≤ 10^6
// Output Format

// Do not print anything inside the function.
// The function should return 1 if the number is a Smith number, otherwise return 0.
// Sample Input 0

// 666
// Sample Output 0

// 1
// Explanation 0

// The sum of the digits of 666 is 18.
// The prime factors of 666 are 2, 3, 3, 37, and the sum of their digits is 2 + 3 + 3 + 3 + 7 = 18.
// Since both sums are equal, 666 is a Smith number.
// Sample Input 1

// 12
// Sample Output 1

// 0
// Explanation 1

// The sum of the digits of 12 is 1 + 2 = 3.
// The prime factors of 12 are 2, 2, 3, and the sum of their digits is 2 + 2 + 3 = 7.
// Since both sums are not equal, 12 is not a Smith number.


#include <stdio.h>

int is_smith_number(int n) {
  
  if(n<=0){
    return 0;
  }
    //sum of the digits 
  int temp=n;
  int total=0;
    while(temp>0){
      int last=temp%10;
      total+=last;
      temp/=10;
    } 
  
  //sum of all prime factors of the number
    int x=0;
    while (n % 2 == 0){
        //printf("2 ");
        x+=2;
        n /= 2;
    }
    for (int i = 3; i * i <= n; i += 2){
        while (n % i == 0) {
           // printf("%d ", i);
          x+=i;
            n /= i;
        }
    }
  int b=0;
    if (n > 2) {
    //printf("%d ", n);
      if(n>10){    //if its two digit number or three
       int ru=n;
        while(ru>0){
          int a=ru%10;
          b+=a;
          ru=ru/10;       
        }       
      }
      //printf("%d ",b);
      x+=b;
    }
  if(total==x){
    return 1;
  }
  else{
    return 0;
  }
   //printf("%d",x);
}

int main() {
    int n;
    scanf("%d", &n);
    printf("%d", is_smith_number(n));
    return 0;
}