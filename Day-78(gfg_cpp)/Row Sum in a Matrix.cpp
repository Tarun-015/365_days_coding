#include <vector>
#include <cmath>
using namespace std;

class Solution {
  public:
    vector<int> rowSum(vector<vector<int>>& mat) {
        // Code here
        int n=mat.size();
        vector<int> arr;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<mat[i].size();j++){
                sum+=mat[i][j];
            }
            arr.push_back(sum);
        }
        return arr;
    }
};