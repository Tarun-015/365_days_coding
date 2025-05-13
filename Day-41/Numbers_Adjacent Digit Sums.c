// You are given two integers x and y. The variable t in this problem represents the number of test cases.

// Each test case is independent and consists of two numbers x and y. For every test case, the program must determine whether there exists an integer n such that:

// S(n) = x
// S(n+1) = y
// where S(a) denotes the sum of the digits of the number a in the decimal numeral system.

// The program processes each test case one after another and outputs either "Yes" (if such an n exists) or "No" (if no such n is found).

// Input Format

// The first line contains an integer t – the number of test cases.
// Each of the next t lines contains two integers x and y.
// Constraints

// 1 ≤ t ≤ 500
// 1 ≤ x ≤ 1000
// 1 ≤ y ≤ 1000
// Output Format

// For each test case, print "Yes" if there exists an integer n satisfying the given conditions. Otherwise, print "No".
// Sample Input 0

// 7
// 1 2
// 77 77
// 997 999
// 999 1
// 1000 1
// 1 11
// 18 1
// Sample Output 0

// Yes
// No
// No
// Yes
// No
// No
// Yes


#include <stdio.h>

// Function to calculate digit sum
int digitSum(int n) {
    int sum = 0;
    while (n > 0) {
        sum += (n % 10);
        n /= 10;
    }
    return sum;
}

int main() {
    int t, x, y;
    scanf("%d", &t);

    while (t--) {
        scanf("%d %d", &x, &y);
        int found = 0;

        // Try all n from 1 to 1e6 (since max digit sum is 1000, n must be at most 999999)
        for (int n = 1; n <= 1000000; n++) {
            if (digitSum(n) == x && digitSum(n + 1) == y) {
                found = 1;
                break;
            }
        }

        if (found)
            printf("Yes\n");
        else
            printf("No\n");
    }

    return 0;
}
