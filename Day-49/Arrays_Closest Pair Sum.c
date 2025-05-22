// You are given an array of integers and a target_sum. Your task is to find the pair of integers in the array whose sum is closest to the target sum. The pair should be decided in the order they appear in the array.

// Input Format

// The first line contains an integer n, the number of elements in the array.
// The second line contains n space-separated integers representing the array elements.
// The third line contains an integer target_sum, the target sum.
// Constraints

// 1 ≤ n ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// 0 ≤ target_sum ≤ 10⁶
// Output Format

// Print the pair as space-separated integers from the array whose sum is closest to the target sum. If multiple pairs have the same closest sum, print the first pair encountered in the order of the array.
// Sample Input 0

// 5
// -1 -2 -3 -4 -5
// -10
// Sample Output 0

// -4 -5
// Sample Input 1

// 6
// 2 4 5 6 1 3
// 8
// Sample Output 1

// 2 6


#include <stdio.h>
#include <stdlib.h>
int main() {
    int n, target;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);  
    scanf("%d", &target);
  
    int min_diff = 200000; 
    int x = 0, y = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            int sum = arr[i] + arr[j];
            int diff = abs(sum - target);
            if (diff < min_diff) {
                min_diff = diff;
                x = arr[i];
                y = arr[j];
            }
        }
    }

    printf("%d %d", x, y);
    return 0;
}
