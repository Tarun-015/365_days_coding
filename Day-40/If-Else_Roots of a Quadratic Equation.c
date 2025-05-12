// Write a program that takes three integers a, b, and c as input, representing the coefficients of a quadratic equation ax^2 + bx + c = 0. The program should calculate and print the roots of the equation along with their type.

// Formula

// image

// where the discriminant D = b^2 − 4ac determines the type of roots:

// If D>0, print "Real and Distinct"
// If D=0, print "Real and Equal"
// If D<0, print "Complex"
// Note: You may use the sqrt() function from math.h to compute square roots.

// Input Format

// A single line containing three space-separated integers: a b c
// Constraints

// −1000 ≤ a, b, c ≤ 1000
// a ≠ 0
// Output Format

// If the roots are real, print:

// Roots: [root1], [root2]
// Type: [TYPE]
// where,

// root1 and root2 are the real roots rounded to 2 decimal places
// TYPE is either "Real and Distinct" or "Real and Equal".
// If the roots are complex, print:

// Roots: [real_part] + [imaginary_part]i, [real_part] - [imaginary_part]i
// Type: Complex
// where,

// real_part is the real part of the root (rounded to 2 decimal places).
// imaginary_part is the imaginary part (rounded to 2 decimal places).
// Sample Input 0

// 1 -3 2
// Sample Output 0

// Roots: 2.00, 1.00
// Type: Real and Distinct
// Sample Input 1

// 1 -2 1
// Sample Output 1

// Roots: 1.00, 1.00
// Type: Real and Equal
// Sample Input 2

// 1 2 5
// Sample Output 2

// Roots: -1.00 + 2.00i, -1.00 - 2.00i
// Type: Complex


#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
  
   if (a == 0) {
        printf("Invalid input: 'a' cannot be zero.\n");
        return 1;
    }

    double D = b * b - 4 * a * c; 

    if (D > 0) {
        double r1 = (-b + sqrt(D)) / (2.0 * a);
        double r2 = (-b - sqrt(D)) / (2.0 * a);
        printf("Roots: %.2f, %.2f\n", r1, r2);
        printf("Type: Real and Distinct\n");
    }
  
   else if (D == 0) {
        double r = -b / (2.0 * a);
        printf("Roots: %.2f, %.2f\n", r, r);
        printf("Type: Real and Equal\n");
    }
  
    else {
        // Complex_wala
        double real_part = -b / (2.0 * a);
        double img_part = sqrt(-D) / (2.0 * a);
        printf("Roots: %.2f + %.2fi, %.2f - %.2fi\n", real_part, img_part, real_part, img_part);
        printf("Type: Complex\n");
    }

    return 0;
}
