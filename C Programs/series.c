#include<stdio.h>
int main()
{
    int i,u,l;
    printf("Enter lower limit and upper limit\n");
    scanf("%d %d",&l,&u);
    printf("The Even Numbers are: ");
    for(i=l;i<=u;i++)
    {
        if(i%2==0)
            printf("%d ",i);
    }
    printf("\nThe odd Numbers are: ");
    for(i=l;i<=u;i++)
    {
        if(i%2==1)
            printf("%d ",i);
    }
    return 0;
}