#include<stdio.h>
#include<string.h>
void pal(char ar[])
{
	int i,l=0;
	char ar2[30];
	for(i=strlen(ar)-1;i>=0;i--)
	{
		ar2[l]=ar[i];
		l++;
	}
	ar2[l]='\0';
	printf("Reversed String: ");
	puts(ar2);
}
void main()
{
	char a[30];
	printf("Enter a string to check\n");
	gets(a);
	pal(a);
}