//input a number and print it is prime or not

#include <stdio.h>

int main()
{
	int n, i, flag=0, rem;
	
	printf("Enter a number \n");
	scanf("%d", &n);
	
	for(i=2; i<n; i++)
	{	
		rem = n%i;
		if(rem == 0)
			flag = 1;
	}
	
	if(flag == 0)
		printf("Prime number \n");
	else
		printf("Not a prime number \n");
		
	return 0;
}

