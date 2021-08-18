#include <stdio.h>
void swap(int *x ,int *y)
{
    int temp;
    temp=*x;
    *x=*y;
    *y=temp;
    printf("After Swapping a = %d b = %d\n",*x,*y);
}
void main()
{
    int a,b;
	printf("Enter two numbers\n");
	scanf("%d%d",&a,&b);
    printf("Before Swapping a = %d b = %d\n",a,b);
    swap(&a,&b);
}