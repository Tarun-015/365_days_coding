#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    string s = "hello";
    unordered_map<char, int> freq;

    for (char c : s)
        freq[c]++;

    for (auto &p : freq)
        cout << p.first << " -> " << p.second << endl;

    return 0;
}
