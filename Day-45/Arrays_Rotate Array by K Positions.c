// You are given an array of integers and an integer k. Your task is to implement a function rotateArray() that rotates the array by k positions. Rotation means that each element is shifted to the left by k positions, and the elements that "fall off" from the beginning are moved to the end of the array. If k is greater than or equal to the number of elements, the rotation should be performed modulo the array size.

// Function Signature

// void rotateArray(int arr[], int n, int k);
// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// The third line contains an integer k, the number of positions to rotate the array.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// 0 ≤ k ≤ 10⁶
// Do not take input from the user.
// Do not print any output.
// Modify the array arr in place to achieve the rotation.
// Output Format

// Print the rotated array as space-separated integers.
// Sample Input 0

// 5
// 1 2 3 4 5
// 2
// Sample Output 0

// 3 4 5 1 2
// Sample Input 1

// 6
// 10 20 30 40 50 60
// 4
// Sample Output 1

// 50 60 10 20 30 40
// Sample Input 2

// 5
// 1 2 3 4 5
// 7
// Sample Output 2

// 3 4 5 1 2


#include <stdio.h>

// Function to rotate the array
void rotateArray(int arr[], int n, int k) {
    // Your implementation here
  k = k % n;
  int a[n];
  for(int i=k,j=0;i<n && j<n-k;i++,j++){
    a[j] = arr[i];
  }
  
  for(int i=n-k,j=0;i<n && j<k;i++,j++){
    a[i] = arr[j];
  }
     for (int i = 0; i < n; ++i) {
        arr[i]=a[i];
    }
}



int main() {
    int n, k;
    // Reading input
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; ++i) {
        scanf("%d", &arr[i]);
    }
    scanf("%d", &k);

    // Call the function to rotate the array
    rotateArray(arr, n, k);
    
    // Print the rotated array
    for (int i = 0; i < n; ++i) {
        printf("%d ", arr[i]);
    }

    return 0;
}