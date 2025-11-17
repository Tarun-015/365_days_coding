#include <iostream>
#include <queue>
#include <unordered_map>
using namespace std;

string firstNonRepeating(string s) {
    unordered_map<char, int> freq;
    queue<char> q;
    string result = "";

    for (char ch : s) {
        freq[ch]++;
        q.push(ch);

        while (!q.empty() && freq[q.front()] > 1) {
            q.pop();
        }

        if (q.empty())
            result += '#';
        else
            result += q.front();
    }
    return result;
}

int main() {
    string s = "aabc";
    cout << firstNonRepeating(s);
    return 0;
}

// Output:
// a#bb