#include <stdio.h>
int main()
{
  int ar[10],i,n,flag=0;
  printf("Enter 10 numbers\n");
  for (i=0;i<10;i++)
    scanf("%d", &ar[i]);
 printf("Enter the number to search\n");	
 scanf("%d",&n);
 for (i=0;i<10;i++)
 	{
	 	if(ar[i]==n)
	 	{
		 flag=1;
		 break;
	 	}
 	}
	 if(flag==1)
	 printf("Number found");
	 else
	 printf("Number not found");
	 return 0;
}


 