// Goldbach's Conjecture asserts that every even integer greater than 2 can be expressed as the sum of two prime numbers.

// Given an integer N, find the smallest prime pair of prime numbers (p, q) such that:

// p + q = N
// p and q are both prime numbers
// p is the smallest prime in the pair (i.e., p ≤ q)
// If no such pair exists, print "No Solution".

// Input Format

// A single integer N.
// Constraints

// 1 ≤ N ≤ 10^6
// Output Format

// Print the smallest pair of prime numbers p and q such that p + q = N. If no such pair exists, print "No Solution".
// Sample Input 0

// 20
// Sample Output 0

// 3 17
// Explanation 0

// We have two possible prime pairs that sum to 20:

// 3 + 17 = 20
// 7 + 13 = 20
// Since 3 is the smallest prime in the pair (3, 17), it is selected as the smallest pair.

// Sample Input 1

// 12
// Sample Output 1

// 5 7


#include <stdio.h>

int prime(int i){
         
        if(i < 2) return 0;
        for(int j=2;j*j<=i;j++){
            if(i%j == 0){
                return 0;
            }
        }
        return 1;
}

 int main() {
    int n,p;
    scanf("%d",&n);
     if(n < 4){
         printf("No Solution\n");
         return 0;
     }
     if(n % 2 != 0){
         printf("No Solution\n");
         return 0;
     }
    int flag=1;
    for(int i=2;i<=n/2;i++){
        p = n - i;
        if(prime(i) && prime(p)){
            printf("%d %d\n", i, p);
            flag = 0;
            break;
        }
    }
    if(flag == 1){
        printf("No Solution");
    }
    return 0;
}