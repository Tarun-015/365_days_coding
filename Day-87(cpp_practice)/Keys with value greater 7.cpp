#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> scores = {
        {"Tarun", 92},
        {"Ravi", 60},
        {"Sneha", 85},
        {"Kunal", 70}
    };

    for (auto &p : scores)
        if (p.second > 75)
            cout << p.first << endl;

    return 0;
}
