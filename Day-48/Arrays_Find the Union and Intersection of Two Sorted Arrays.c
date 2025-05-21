// You are given two sorted arrays of integers. Your task is to find:

// Union: A sorted array containing all unique elements from both arrays.
// Intersection: A sorted array containing only the common elements from both arrays.
// You must write a code which takes two array inputs and outputs union and intersection of two arrays, if possible.

// Input Format

// The first line contains an integer n₁, the number of elements in the first array.
// The second line contains n₁ space-separated integers.
// The third line contains an integer n₂, the number of elements in the second array.
// The fourth line contains n₂ space-separated integers.
// Constraints

// 1 ≤ n₁,n₂ ≤ 10⁵
// -10⁶ ≤ arr[i] ≤ 10⁶ for each element in both arrays
// The input arrays are already sorted in non-decreasing order
// Duplicates may appear in the input arrays.
// The final union and intersection arrays should be printed in ascending order.
// Output Format

// First line: The union of the two arrays (all unique elements from both arrays, in ascending order).
// Second line: The intersection of the two arrays (all common unique elements, in ascending order), or "Intersection Not Possible" if the intersection is empty.
// Sample Input 0

// 5
// 1 2 3 4 5
// 5
// 3 4 6 7 8
// Sample Output 0

// 1 2 3 4 5 6 7 8
// 3 4
// Sample Input 1

// 6
// -5 -3 0 1 3 5
// 7
// -4 -3 0 2 3 4 6
// Sample Output 1

// -5 -4 -3 0 1 2 3 4 5 6
// -3 0 3


#include <stdio.h>
#include <stdlib.h>

// Comparator function for sorting
int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}


void Union(int a[], int n, int b[], int m) {
    int new[n+m],k=0;
  // A and B ko new array me
    for (int i = 0; i < n; i++) new[k++] = a[i];
    for (int i = 0; i < m; i++) new[k++] = b[i];

   qsort(new, k, sizeof(int), compare);

    printf("%d ",new[0]);
    for (int i = 1; i < k; i++) {
        if (new[i] != new[i - 1]) { 
            printf("%d ", new[i]);
        }
    }
  printf("\n");
}

void Intersection(int a[], int n, int b[], int m) {
    int last = 1000001; 
  int flag=0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (a[i] == b[j]) {
              if(a[i]!=last){
                printf("%d ",a[i]);
                flag=1;
                last = a[i];
              }  
            }
          }
        }
  
   if(flag==0){
     printf("Intersection Not Possible");
   }
    printf("\n");
}

int main() {
    int n, m;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    scanf("%d", &m);
    int b[m];
    for (int i = 0; i < m; i++) {
        scanf("%d", &b[i]);
    }
    Union(a, n, b, m);
    Intersection(a, n, b, m);
    return 0;
}
