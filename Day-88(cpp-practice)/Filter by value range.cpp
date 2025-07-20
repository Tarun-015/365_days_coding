#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> productPrices = {
        {"Soap", 30}, {"Shampoo", 120}, {"Toothpaste", 60}, {"Facewash", 150}
    };

    for (auto &p : productPrices)
        if (p.second >= 50 && p.second <= 130)
            cout << p.first << endl;

    return 0;
}
