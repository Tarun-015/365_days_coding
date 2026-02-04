// Dynamic Memory & Dangling Pointer
#include <stdio.h>
#include <stdlib.h>
int main() {
    int *p = malloc(sizeof(int));
    *p = 10;
    free(p);
    printf("%d", *p); // what happens here?
    return 0;
}