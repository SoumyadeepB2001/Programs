#include <stdio.h>
int main()
{
    int i,n,pos,temp;
    int ar[11];
    printf("Enter 10 values\n");
    for(i=0;i<=9;i++)
    scanf("%d",&ar[i]);
    printf("Enter the position and number to insert\n");
    scanf("%d %d",&pos,&n);
    for(i=9;i>pos-2;i--)
    {
        ar[i+1]=ar[i];
    }
    ar[pos-1]=n;
    for(i=0;i<=10;i++)
    {
        printf("%d ",ar[i]);
    }
    return 0;
}