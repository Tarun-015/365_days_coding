// A number is called a Strong number if the sum of the factorials of its digits is equal to the number itself.

// Given an integer N, determine whether it is a Strong number or not.

// Input Format

// A single integer N
// Constraints

// 1 ≤ N ≤ 10⁶
// Output Format

// Print "YES" if N is a Strong number, otherwise print "NO"
// Sample Input 0

// 145
// Sample Output 0

// YES
// Explanation 0

// 1! + 4! + 5! = 1 + 24 + 120 = 145

// Sample Input 1

// 123
// Sample Output 1

// NO


#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int z=n;
  int d=0;
  int temp = n;
    while (temp > 0) {
        temp /= 10;
        d++;
    }
 // int x=1;
  int b=0;
  for(int i=1;i<=d;i++){
    int w=n%10;
       int x=1;
    for(int j=1;j<=w;j++){  
      x*=j;      
    }
    //printf("%d ",x);
    b+=x;
    n/=10;
  }
  //printf("%d",b);  
  if(b==z){
    printf("YES");
  }
  else{
    printf("NO");
  }
    return 0;
  
}