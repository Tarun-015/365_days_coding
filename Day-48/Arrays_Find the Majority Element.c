// You are given an array of integers. A majority element in an array is an element that appears more than ⌊n/2⌋ times, where n is the size of the array. Your task is to determine if the array contains a majority element. If it does, print the majority element; otherwise, print "No Majority Element".

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// Output Format

// Print the majority element if one exists.
// If no majority element exists, print "No Majority Element".
// Sample Input 0

// 7
// 3 3 4 2 4 4 2
// Sample Output 0

// No Majority Element
// Sample Input 1

// 7
// 2 2 1 1 2 2 3
// Sample Output 1

// 2



#include <stdio.h>

int main() {
  int n;
  scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
      scanf("%d ",&arr[i]);
    }
    int freq[100000] = {0}; 
    for (int i = 0; i < n; i++) {
        freq[arr[i]]++;
    }
  int flag=0;
    for (int i = 0; i < 100; i++) {
        if (freq[i] > n/2) {
           printf("%d\n", i);  
            flag=1;
          break;
        }
    }
  
  if(flag==0){
    printf("No Majority Element");
  }
    return 0;
}
