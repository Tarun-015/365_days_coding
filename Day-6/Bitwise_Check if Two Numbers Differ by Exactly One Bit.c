// Write a program to check if two integers a and b differ by exactly one bit using bitwise operators. Two numbers differ by exactly one bit if their binary representations differ in only one position.

// Input Format

// Two space-separated integers a and b.
// Constraints

// −10^9 ≤ a,b ≤10^9
// Output Format

// Output "Yes" if the given numbers differ by exactly one bit, otherwise output "No".
// Sample Input 0

// 5 7
// Sample Output 0

// Yes
// Sample Input 1

// 7 14
// Sample Output 1

// No

#include <stdio.h>

int main() {
  int a,b;
  scanf("%d %d",&a,&b);
  int r = a^b;
  if((r!=0 && (r&(r-1))) == 0){
     printf("Yes");
  }
     else{
        printf("No");
     }

    return 0;
}