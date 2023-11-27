#include <stdio.h>

int main() {
    int a=5;
    int *b = &a;
    int **c = &b;
    int ***d = &c;
    
    printf("%d\n",a);
    printf("%p\n",&a);
    printf("%p\n",b);
    printf("%p\n",&b);
    printf("%p\n",c);
    printf("%p\n",d);
}
