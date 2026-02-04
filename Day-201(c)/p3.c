// Preprocessor & Macros
#include <stdio.h>
#define SQUARE(x) x*x
int main() {
    int a = 3;
    printf("%d\n", SQUARE(a+1));
    return 0;
}