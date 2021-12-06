//nested if-else

#include <stdio.h>

int main()
{
	int n1,n2,n3,largest;
	printf("Enter 3 numbers \n");
	scanf("%d",&n1);
	scanf("%d",&n2);
	scanf("%d",&n3);
	if(n1>=n2)
		if(n1>=n3)
			largest = n1;
		else
			largest = n3;
	else
		if(n2>=n3)
			largest = n2;
		else
			largest = n3;
		
	printf("Largest is %d \n",largest);
	 
	return 0;
}


