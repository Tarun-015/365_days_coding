// Static Variable Behavior
#include <stdio.h>
void count() {
    static int x = 0;
    x++;
    printf("%d ", x);
}
int main() {
    for(int i=0;i<3;i++) count();
    return 0;
}