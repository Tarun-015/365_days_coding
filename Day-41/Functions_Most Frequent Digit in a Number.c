// Implement a function find_most_frequent_digit(n) that returns the most frequent digit in a given number n. If there is a tie in frequency, return the largest of those digits.

// Function Signature

// int find_most_frequent_digit(int n);
// Input Format

// There is no input handling required in the function.
// The function takes a single integer n as a parameter.
// Constraints

// 0 ≤ n ≤ 10^9
// Output Format

// Do not print anything inside the function.
// The function must return the most frequent digit as an integer. If there is a tie, return the largest digit among those with the highest frequency.
// Sample Input 0

// 122333
// Sample Output 0

// 3
// Sample Input 1

// 140334
// Sample Output 1

// 4


#include <stdio.h>

int find_most_frequent_digit(int n) {
    //Implement this function
  int freq[10] = {0}; 
   
    while (n > 0) {
        int digit = n % 10;  //ek digit ka
        freq[digit]++;
        n /= 10;
    }
    
    int max_freq = 0, most_frequent = 0;
    for (int i = 0; i < 10; i++) {
        if (freq[i] >= max_freq) {
            max_freq = freq[i];
            most_frequent = i;
        }
    }   
    return most_frequent;
}


int main() {
    int n;
    scanf("%d", &n); 
    printf("%d\n", find_most_frequent_digit(n)); 
    return 0;
}