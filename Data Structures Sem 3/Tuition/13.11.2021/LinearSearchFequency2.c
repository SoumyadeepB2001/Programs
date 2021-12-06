#include <stdio.h>
int main()
{
	int a[20], len, i, j, count, flag;
	printf("Enter the length of the array \n");
	scanf("%d", &len);
	printf("Enter the elements of the array \n");
	for(i=0; i<len; i++)
	{
		scanf("%d", &a[i]);
	}
	
	for(i=0; i<len; i++)
	{
		count = 0;
		flag = 0;
		for(j=0; j<i; j++)
		{
			if(a[j]==a[i])
			{
				flag = 1;
			}
		}
		if(flag==0)
		{
			for(j=i; j<len; j++)
			{
				if(a[i]==a[j])
					count++;
			}
			printf("frequency of %d is %d \n", a[i],count);
		}
	}
	return 0;
}
