// Given an integer 𝑁, write a program to determine whether 𝑁 is a palindrome. A number is called a palindrome if it reads the same backward as forward.

// Input Format

// A single integer 𝑁.
// Constraints

// 1 <= N <= 109
// Output Format

// Print "YES" if 𝑁 is a palindrome, otherwise print "NO".
// Sample Input 0

// 121
// Sample Output 0

// YES
// Explanation 0

// 121 is palindrome.

// Sample Input 1

// 146
// Sample Output 1

// NO
// Explanation 1

// 146 is not palindrom.

#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int b=n;
  int a=0;
  while(n!=0){
    int l=n%10;
    a=a*10+l;
    n=n/10;   
  }
 if(a==b){
   printf("YES");
 }
  else{
    printf("NO");
  }

    
}