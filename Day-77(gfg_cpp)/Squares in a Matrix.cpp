
class Solution {
  public:
    int squaresInMatrix(int m, int n) {
        // code here
        int count=0;
        while(m>0 && n>0){
            count+=(n*m);
            n--,m--;
        }
        return count;
    }
};