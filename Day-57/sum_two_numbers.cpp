// Program to input two integers and print their sum, difference, product, and quotient

#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Enter two integers: ";
    cin >> a >> b;

    cout << "Sum: " << a + b << endl;
    cout << "Difference: " << a - b << endl;
    cout << "Product: " << a * b << endl;
    if (b != 0)
        cout << "Quotient: " << a / b << endl;
    else
        cout << "Division by zero error!" << endl;

    return 0;
}
