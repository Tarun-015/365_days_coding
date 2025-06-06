// Leaders in Arrays : arr[i] is leader if 
// arr[i]> max of all elements m in right

#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int leaders(vector<int>& ar) {
    int c=0;
    for(int i=0;i<ar.size();++i){
        int max = INT_MIN;
        for(int j=i+1;j<ar.size();++j){
            if(ar[j]>max){
                max=ar[j];
            }
            if(ar[i]>max){
                c++;
            }
        }
    }
    return c;
}

int main() {
    vector<int> ar = {10,7,9,3,2,4};
    cout << leaders(ar) << endl;
    return 0;
}