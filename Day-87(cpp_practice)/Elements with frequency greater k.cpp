#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    int arr[] = {1, 2, 2, 3, 1, 1, 4};
    int k = 1;
    unordered_map<int, int> freq;

    for (int x : arr)
        freq[x]++;

    for (auto &p : freq)
        if (p.second > k)
            cout << p.first << endl;

    return 0;
}
