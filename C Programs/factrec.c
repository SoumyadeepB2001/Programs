#include <stdio.h>
int fact(int x)
{
    if(x==0)
    return 1;
    else
    return x*fact(x-1);
}
void main()
{
    int a,b;
	printf("Enter a number\n");
	scanf("%d",&a);
    b=fact(a);
    printf("Factorial of %d = %d",a,b);
}