// Program to calculate factorial using a loop

#include <iostream>
using namespace std;

int main() {
    int n;
    long long fact = 1;

    cout << "Enter a number: ";
    cin >> n;

    if (n < 0)
        cout << "Factorial not defined for negative numbers!" << endl;
    else {
        for (int i = 1; i <= n; ++i)
            fact *= i;
        cout << "Factorial of " << n << " is " << fact << endl;
    }

    return 0;
}
