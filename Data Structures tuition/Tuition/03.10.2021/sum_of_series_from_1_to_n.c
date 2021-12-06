#include <stdio.h>

int main()
{
	int i,sum=0,n;
	printf("Enter a number \n");
	scanf("%d",&n);
	for(i=1; i<=n; i=i+1)
	{
		sum=sum+i;
	}
	printf("Sum is %d \n",sum);
}


