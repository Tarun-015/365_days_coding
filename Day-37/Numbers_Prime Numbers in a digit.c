// Write a program to count the nuber of digits of a given number N that are prime.

// Input Format

// A single integer N
// Constraints

// −10^18 ≤ N ≤ 10^18
// Output Format

// Print a single integer representing the count of prime digits in N.
// Sample Input 0

// 128
// Sample Output 0

// 1
// Sample Input 1

// 406379
// Sample Output 1

// 2


#include <stdio.h>

int main() {
  long long n;
  scanf("%lld",&n);
  int a=0;
  if(n<0){
    n=n*(-1);
    
  }
  while(n>0){
    int l=n%10;
    if(l==3||l==5||l==7||l==2){
      a++;
    }
    n=n/10;
  }
  printf("%d",a);

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}