#include <iostream>
#include <vector>
using namespace std;

int equ(vector<int>& ar) {
    int total = 0,c=0;

    for (int i = 0; i < ar.size(); i++) {
        total += ar[i];
    }
    int lsum=0;
    for (int i = 0; i < ar.size(); i++){
        int rsum=0;
        lsum+=ar[i];
        rsum=total-lsum;
        if(lsum==rsum){
            c++;
        }
    }
    return c;
    
}

int main() {
    vector<int> ar = {-7, 1, 5, 2, -4, 3, 0};
    cout << equ(ar) << endl;
    return 0;
}