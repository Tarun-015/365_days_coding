// Write a program to print a 01 Right Triangle pattern based on the input size n. The triangle has n rows, where each row alternates between 1 and 0. The first row contains only 1, and each subsequent row starts alternating from the opposite digit of the first element in the previous row.

// Note: Handle invalid inputs gracefully by displaying an appropriate error message, "Shape Not Possible", if the pattern cannot be drawn by the given input value.

// Input Format

// A single integer n.
// Constraints

// -50 ≤ n ≤ 50
// Output Format

// Print the n-row triangle where each row alternates between 1 and 0.
// Print "Shape Not Possible" if the pattern cannot be drawn.
// Sample Input 0

// 5
// Sample Output 0

// 1
// 01
// 101
// 0101
// 10101
// Sample Input 1

// 0
// Sample Output 1

// Shape Not Possible

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
  int n;
  scanf("%d",&n);
  if(n<1){
    printf("Shape Not Possible");
  }
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      if(j%2==0 && i%2==0){
        printf("1");
      }
      
      else if((i%2==0&&j%2==1)||(i%2==1&&j%2==0)){
        printf("0");
      } 
      else if(j%2==1){
        printf("1");
      }
      else{
        printf("0");
      }
    }
    printf("\n");
  }
  

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
