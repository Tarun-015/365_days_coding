#include <iostream>
#include <unordered_map>
using namespace std;

bool areAnagrams(string s1, string s2) {
    if (s1.size() != s2.size()) return false;

    unordered_map<char, int> freq;

    for (char c : s1) freq[c]++;
    for (char c : s2) freq[c]--;

    for (auto &p : freq)
        if (p.second != 0) return false;

    return true;
}

int main() {
    string s1 = "listen", s2 = "silent";
    cout << (areAnagrams(s1, s2) ? "Yes" : "No") << endl;
    return 0;
}
