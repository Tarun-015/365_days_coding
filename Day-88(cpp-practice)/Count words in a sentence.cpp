#include <iostream>
#include <sstream>
#include <unordered_map>
using namespace std;

int main() {
    string sentence = "this is a test this is";
    unordered_map<string, int> freq;
    string word;
    stringstream ss(sentence);

    while (ss >> word)
        freq[word]++;

    for (auto &p : freq)
        cout << p.first << " -> " << p.second << endl;

    return 0;
}
