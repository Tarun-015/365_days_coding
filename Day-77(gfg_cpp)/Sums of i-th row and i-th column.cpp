// User function Template for C++
#include <vector>
using namespace std;

class Solution {
  public:
    int sumOfRowCol(int N, int M, vector<vector<int>> A) {
        // code here
        int limit = min(N, M);
        for(int i = 0; i < limit; i++) {
            long long Rsum = 0, Csum = 0;
    
            for(int j = 0; j < M; j++) {
                Rsum += A[i][j];
            }

            for(int j = 0; j < N; j++) {
                Csum += A[j][i];
            }

            if(Rsum != Csum) return 0;
        }
        return 1;
    }
};