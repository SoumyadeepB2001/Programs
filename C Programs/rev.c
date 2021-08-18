#include <stdio.h>
int main()
{
    int i;
    int ar[10];
    printf("Enter 10 values\n");
    for(i=0;i<=9;i++)
    scanf("%d",&ar[i]);
    printf("The reverse of the array is\n");
	for(i=9;i>=0;i--)
	printf("%d ",ar[i]);
	return 0;
}