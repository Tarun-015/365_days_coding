#include <vector>
#include <cmath>
using namespace std;

class Solution {
  public:
    vector<int> colSum(vector<vector<int>>& mat) {
        // Code here
        int n=mat.size();
        vector<int> arr;
        for(int i=0;i<mat[0].size();i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=mat[j][i];
            }
            arr.push_back(sum);
        }
        return arr;
    }
};