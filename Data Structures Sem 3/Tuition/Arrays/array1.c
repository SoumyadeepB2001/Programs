#include <stdio.h>
int main()
{
	int a[20], len, i;
	printf("Enter the length of the array \n");
	scanf("%d", &len);
	
	printf("Enter the value of the array \n");
	for(i=0; i<len; i++)
	{
		scanf("%d", &a[i]);
	}
	
	printf("Value of the array \n");
	for(i=0; i<len; i++)
	{
		printf("%d ", a[i]);
	}
	return 0;
} 
