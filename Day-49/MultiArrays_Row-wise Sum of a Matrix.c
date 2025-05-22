// You are given a 2D integer matrix of size N × M. Your task is to compute and print the sum of elements in each row of the matrix.

// Input Format

// The first line contains two space-separated integers, N and M — the number of rows and columns in the matrix.
// The next N lines contain M space-separated integers each, representing the matrix elements.
// Constraints

// Print N space-separated integers, where the i-th integer represents the sum of elements in the i-th row of the matrix.
// Output Format

// 1 ≤ N,M ≤ 100
// −10^3 ≤ A[i][j] ≤10^3
// Sample Input 0

// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// Sample Output 0

// 10 26 42



#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    
    int a[n][m];  
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    for(int i = 0; i < n; i++) {
        int sum = 0;
        for(int j = 0; j < m; j++) {
            sum += a[i][j];
        }
        printf("%d ", sum);
    }

    return 0;
}