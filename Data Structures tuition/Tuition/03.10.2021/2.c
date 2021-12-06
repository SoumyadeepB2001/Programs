//input a number and check it is even or odd

#include <stdio.h>

int main()
{
	int n, rem;
	printf("Enter a number \n");
	scanf("%d",&n);
	rem = n%2;
	if(rem == 0)
		printf("Even \n");
	else
		printf("Odd \n");
		
	return 0;
}


