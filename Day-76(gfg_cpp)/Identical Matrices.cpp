// User function Template for C++
#include <vector>
using namespace std;

class Solution {
  public:
    int areMatricesIdentical(int N, vector<vector<int>> Grid1,
                             vector<vector<int>> Grid2) {
        // code here
        int n=Grid1.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Grid1[i][j]!=Grid2[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
};