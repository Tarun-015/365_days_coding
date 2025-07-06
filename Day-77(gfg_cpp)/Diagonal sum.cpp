// User function Template for C++
#include <vector>
using namespace std;

class Solution {
  public:
    int DiagonalSum(vector<vector<int> >& matrix) {
        // Code here
        int N= matrix.size();
        int sum=0;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size();j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==N-1){
                    sum+=matrix[i][j];
                }
                
            }
        }
        return sum;
    }
};