// User function template for C++
#include <vector>
#include <cmath>
using namespace std;

class Solution {
  public:
    int diagonalSumDifference(int N, vector<vector<int>> Grid) {
        // code here
        int Ssum=0,Psum=0;
        for(int i=0;i<Grid.size();i++){
            for(int j=0;j<Grid.size();j++){
                if(i==j){
                    Ssum+=Grid[i][j];
                }
                if(i+j==N-1){
                    Psum+=Grid[i][j];
                }
                
            }
        }
        return abs(Ssum-Psum);
    }
};