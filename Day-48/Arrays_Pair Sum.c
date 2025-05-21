// You are given an array of integers and a target_sum. Your task is to find the first pair of integers in the array whose sum is equal to the target sum. The pair should be printed in the order they appear in the array.

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// The third line contains an integer target_sum, the target sum.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// 0 ≤ target_sum ≤ 10⁶
// Output Format

// Print the first pair of integers in the array whose sum is equal to the target sum. Print the pair as space-separated integers on a single line. If no such pair exists, print -1.
// Sample Input 0

// 5
// 1 2 3 4 5
// 5
// Sample Output 0

// 1 4
// Sample Input 1

// 6
// -10 -20 -30 -40 -50 -60
// -70
// Sample Output 1

// -10 -60


#include <stdio.h>

int main() {
  int n,tar;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  scanf("%d",&tar);
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      if(tar==a[i]+a[j]){
        printf("%d %d",a[i],a[j]);
        return 0;
      }
    }
  }
  printf("-1");
  
    return 0;
}