
#include <stdio.h>
int i=5;
void prnt()
{
    printf("%d\n",i);
}

int main()
{
    extern int j;
    printf("%d\n",i);
    j=6;
    prnt();
}


