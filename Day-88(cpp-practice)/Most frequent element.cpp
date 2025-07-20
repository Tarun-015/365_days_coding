#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    int arr[] = {1, 2, 3, 2, 2, 3, 1};
    unordered_map<int, int> freq;

    for (int x : arr)
        freq[x]++;

    int maxFreq = 0, result = -1;
    for (auto &p : freq) {
        if (p.second > maxFreq) {
            maxFreq = p.second;
            result = p.first;
        }
    }

    cout << result << " -> " << maxFreq << " times" << endl;
    return 0;
}
