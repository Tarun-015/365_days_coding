// Given an array of N integers, your task is to determine the maximum and minimum values in the array.

// Input Format

// The first line contains an integer N, the number of elements in the array.
// The second line contains N space-separated integers A[i], representing the elements of the array.
// Constraints

// 1 ≤ N ≤ 10^5
// −10^9 ≤ A[i] ≤ 10^9
// Output Format

// Print two space-separated integers: the maximum and minimum values in the array.
// Sample Input 0

// 5  
// 1 3 5 7 9
// Sample Output 0

// 9 1
// Sample Input 1

// 4  
// -5 -2 -9 -1
// Sample Output 1

// -1 -9


#include <stdio.h>

int main() {  
  int n;
  scanf("%d", &n);

  int arr[n];     
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]); 
    }
  int min=arr[0];
  int max=arr[0];
  for(int i=0;i<=n-1;++i){
    if(arr[i]>max){
      max=arr[i];
    }
    if(arr[i]<min){
      min=arr[i];
    }
  }
  printf("%d %d",max,min);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}