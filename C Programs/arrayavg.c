#include<stdio.h>
int main()
{
	int i;
	float av,s=0;
	float ar[10];
	printf("Enter 10 numbers\n");
	for(i=0;i<=9;i++)
	{
		scanf("%f",&ar[i]);
		s=s+ar[i];	
	}
	av=s/10;
	printf("The sum of all the elements of the array is %.2f\n",s);
	printf("The average of all the elements of the array is %.2f",av);
	return 0;
}