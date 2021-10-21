#include<stdio.h>
#include<stdlib.h>
void main()
{
	int n,i,*x,sum=0;
	printf("How many student are in the class?\n");
	scanf("%d",&n);
	x=(int *)malloc(n*sizeof(int));

	if(x==NULL)
		exit(1);

	printf("Enter the marks of %d students\n",n);
	for(i=0;i<n;i++)
		scanf("%d",(x+i));
	for(i=0;i<n;i++)
		sum=sum+*(x+i);
	
	printf("Sum of marks = %d",sum);
}