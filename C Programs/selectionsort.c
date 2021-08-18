#include <stdio.h>
int main()
{
int a[10],n,i,j,p,swap;
printf("Enter 10 numbers\n");
for (i = 0; i < 10; i++)
scanf("%d", &a[i]);
for(i=0;i<9;i++)
{
p=i;
for(j=i+1;j<10;j++)
{
if(a[p] > a[j])
p=j;
}
if(p!= i)
{
swap=a[i];
a[i]=a[p];
a[p]=swap;
}
}
printf("Sorted Array: ");
for(i=0;i<10;i++)
printf("%d ",a[i]);
return 0;
}