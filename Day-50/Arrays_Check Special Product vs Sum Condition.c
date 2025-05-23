// You are given an array of integers. Your task is to check if the product of the second largest and first smallest element is greater than the sum of the second smallest and first largest element.

// Input Format

// First line contains an integer n, the number of elements in the array.

// Second line contains n space-separated integers.

// Constraints

// 4 ≤ n ≤ 10⁵

// -10⁶ ≤ arr[i] ≤ 10⁶

// Output Format

// Print "True" if (second_largest * smallest) > (second_smallest + largest), otherwise print "False".

// Sample Input 0

// 5
// 3
// 5
// 1
// 9
// 2
// Sample Output 0

// False
// Explanation 0

// Explaination: (second_largest * smallest) is not greater than (second_smallest + largest)

// Sample Input 1

// 6
// 10
// 20
// 30
// 5 
// 4
// 3
// Sample Output 1

// True


#include<stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int main(){
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  
  qsort(a, n, sizeof(int), compare);
  int test_1=a[n-2]*a[0];
  int test_2=a[1]+a[n-1];
  
  if(test_1>test_2){
    printf("True");
  }
  else{
    printf("False");
  }
}
