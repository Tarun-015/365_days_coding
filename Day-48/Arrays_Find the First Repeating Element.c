// You are given an array of integers. Your task is to find the first repeating element in the array. An element is considered "repeating" if it occurs more than once. If multiple elements repeat, the answer is the one whose first occurrence appears earliest in the array. If no element repeats, print "No Repeating Element".

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// Output Format

// Print the first repeating element.
// If there is no repeating element, print "No Repeating Element".
// Sample Input 0

// 7
// 10 5 3 4 3 5 6
// Sample Output 0

// 5
// Explanation 0

// 5 appears twice and its first appearance is at index 1 which is less than 3 whose first the occurring index is 2.

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// No Repeating Element


#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  int flag=1;
 // int temp=a[0];
  for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
      if(a[i]==a[j]){
        printf("%d",a[j]);
        flag=0;
        break;
      }
    }
     if (flag==0){
            break;  
        }
  }
  if(flag==1){
    printf("No Repeating Element");
  }
    return 0;
}