// You are given an array of positive integers. Your task is to find the element that occurs most frequently in the array. If more than one element has the same highest frequency, print the one that appears first in the array.

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// Constraints

// 1 ≤ n ≤ 10⁵
// 1 ≤ arr[i] ≤ 1000
// Output Format

// Print the most frequent element in the array.
// Sample Input 0

// 5
// 10 20 10 30 10
// Sample Output 0

// 10
// Sample Input 1

// 6
// 5 5 4 4 6 7
// Sample Output 1

// 5



#include <stdio.h>
int freq(int a[],int n){
  
  int feq[n];   
    for (int i = 0; i < n; ++i) {
        feq[i] = 0;  
    }
  
  
  for (int i = 0; i < n; ++i) {
        if (feq[i] == -1) continue;  
        for (int j = i + 1; j < n; ++j) {
            if (a[i] == a[j]) {
                feq[i]++;
                feq[j] = -1;  
            }
        }
    }
  
    int max = feq[0];
    int max_value = a[0];  
    for (int i = 1; i < n; ++i) {
        if (feq[i] > max) {
            max = feq[i];
            max_value = a[i];  
        }
    }

    return max_value;  
} 


int main() {
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  printf("%d",freq(a,n));  
    return 0;
}