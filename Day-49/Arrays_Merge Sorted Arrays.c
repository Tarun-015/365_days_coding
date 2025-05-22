// You are given two sorted arrays of integers. Your task is to merge these two arrays into a single sorted array that contains all the elements from both arrays. The resulting array should maintain non-decreasing order.

// Input Format

// The first line contains an integer n₁, the number of elements in the first array.
// The second line contains n₁ space-separated integers sorted in non-decreasing order.
// The third line contains an integer n₂, the number of elements in the second array.
// The fourth line contains n₂ space-separated integers sorted in non-decreasing order.
// Constraints

// 1 ≤ n₁,n₂ ≤ 10⁶
// -10⁶ ≤ arr[i] ≤ 10⁶
// Both arrays are sorted in non-decreasing order.
// Output Format

// Print the merged sorted array containing all n₁ + n₂ elements as space-separated integers.
// Sample Input 0

// 5
// 1 3 5 7 9
// 4
// 2 4 6 8
// Sample Output 0

// 1 2 3 4 5 6 7 8 9
// Sample Input 1

// 3
// -5 0 3
// 3
// -2 2 4
// Sample Output 1

// -5 -2 0 2 3 4


#include <stdio.h>
#include<stdbool.h>
int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}


int main() {
  int n,m;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  scanf("%d",&m);
  int b[m];
  for(int i=0;i<m;i++){
    scanf("%d",&b[i]);
  }
    int new[n+m],k=0;
    for (int i = 0; i < n; i++) new[k++] = a[i];
    for (int i = 0; i < m; i++) new[k++] = b[i];

   qsort(new, k, sizeof(int), compare);

    printf("%d ",new[0]);
    for (int i = 1; i < k; i++) {
        // if (new[i] != new[i - 1]) { 
            printf("%d ", new[i]);
       // }
    }
  
    return 0;
}