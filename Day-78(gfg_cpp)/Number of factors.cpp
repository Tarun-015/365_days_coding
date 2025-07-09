#include <vector>
#include <cmath>
using namespace std;

class Solution {
  public:
    int countFactors(int N) {
        int c = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i != N / i)
                    c += 2; // i and N/i are different
                else
                    c += 1; // i == N/i (perfect square)
            }
        }
        return c;
    }
};
