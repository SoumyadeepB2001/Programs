#include <stdio.h>
int main()
{
    int i,pos,temp;
    int ar[10];
    printf("Enter 10 values\n");
    for(i=0;i<=9;i++)
    scanf("%d",&ar[i]);
    printf("Enter the position to delete\n");
    scanf("%d",&pos);
    for(i=pos-1;i<10;i++)
    {
        ar[i]=ar[i+1];
}
 printf("New array after deletion\n");
    for(i=0;i<9;i++)
    {
        printf("%d ",ar[i]);
    }
    return 0;
}