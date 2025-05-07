// Given an integer N, determine whether it is equal to the factorial of some non-negative integer x (i.e., N=x! for some x ≥ 0). If yes, print that number whose factorial is equal to N, otherwise print "NO".

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^19
// Output Format

// Print the integer x if N=x!, otherwise, print "NO".
// Sample Input 0

// 120
// Sample Output 0

// 5
// Sample Input 1

// 150
// Sample Output 1

// NO


#include <stdio.h>

 int main() {
  long long n;
  scanf("%lld",&n);
   if(n==2){
     printf("2");
     return 0;
   }
   
   if(n <= 0){
     printf("NO");
     return 0;
   }
   long long fact=1,x=1;
   while(fact<n/2){
     x++;
     fact *= x;
   }
   if(fact==n){
     printf("%lld",x);
   }
   else{
     printf("NO");
   }  
    return 0;
}
