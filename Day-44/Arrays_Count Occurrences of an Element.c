// You are given an array of integers and a target element. Your task is to count how many times the target element occurs in the array and output that count.

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// The third line contains a single integer, the target element whose occurrences you need to count.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// -10⁶ ≤ target ≤ 10⁶
// Output Format

// Print a single integer representing the number of times the target element occurs in the array.
// Sample Input 0

// 6
// 1 2 3 2 4 2
// 2
// Sample Output 0

// 3
// Sample Input 1

// 5
// 10 20 30 40 50
// 25
// Sample Output 1

// 0


#include <stdio.h>

int main() {
  int n;
  scanf("%d", &n);

  int arr[n];     
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]); 
    }
  int target;
  scanf("%d",&target);
  int count=0;
  for(int i=0;i<=n-1;i++){
    if(target==arr[i]){
      count++;
    }
  }
  printf("%d",count);

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}