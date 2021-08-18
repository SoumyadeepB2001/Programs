#include<stdio.h>
int main()
{
	int i,n,ar[10];
	printf("Enter the number of elements: ");
	scanf("%d",&n);
	printf("Enter array elements\n");
	for(i=0;i<n;i++)
	scanf("%d",&ar[i]);
	printf("The array entered is: ");
	for(i=0;i<n;i++)
	printf("%d ",ar[i]);
	return 0;
}