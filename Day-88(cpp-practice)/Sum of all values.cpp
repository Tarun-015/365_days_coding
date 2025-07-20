#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, int> expenses = {
        {"Food", 200},
        {"Travel", 500},
        {"Books", 300}
    };

    int total = 0;
    for (auto &p : expenses)
        total += p.second;

    cout << "Total = " << total << endl;
    return 0;
}
