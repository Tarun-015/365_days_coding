// Call by Value vs Reference
#include <stdio.h>
void update(int *x, int y) {
    *x = *x + 10;
    y = y + 10;
}
int main() {
    int a = 5, b = 5;
    update(&a, b);
    printf("%d %d\n", a, b);
    return 0;
}