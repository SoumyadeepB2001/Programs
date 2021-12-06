#include <stdio.h>
int main()
{
	int a[20], b[10], len, i, j;
	for(i=0; i<10; i++)
	{
		b[i]=0;
	}
	printf("Enter the length of the array \n");
	scanf("%d", &len);
	printf("Enter the elements of the array \n");
	for(i=0; i<len; i++)
	{
		scanf("%d", &a[i]);
	}
	for(i=0; i<len; i++)
	{
		b[a[i]]++;
	}
	for(i=0; i<10; i++)
	{
		if(b[i]!=0)
			printf("Frequency of %d is %d \n",i,b[i]);
	}
	return 0;
}








`
