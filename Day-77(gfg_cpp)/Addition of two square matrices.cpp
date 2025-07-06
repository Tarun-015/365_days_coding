// User function Template for C++
#include <vector>
using namespace std;

class Solution {
  public:
    void Addition(vector<vector<int>>& matrixA, vector<vector<int>>& matrixB) {
        // Code here
        if (matrixA.empty() || matrixB.empty()) return;
        
        int rows = matrixA.size();
        int cols = matrixA[0].size();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
               
            }
            
        }
    }
};  