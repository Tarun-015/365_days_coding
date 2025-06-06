//optimised version of leaders in Array
#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int leaders(vector<int>& ar) {
    int c=0;
    int max = INT_MIN;
    for(int i=ar.size()-1;i>=0;--i){
            if(ar[i]>max){
                c++;
            }
        }
    return c;
}

int main() {
    vector<int> ar = {10,7,9,3,2,4};
    cout << leaders(ar) << endl;
    return 0;
}