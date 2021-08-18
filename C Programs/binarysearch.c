#include <stdio.h>
int main()
{
    int a,mid,f,l,i,j,k=0,swap;
    int ar[10];
    printf("Enter 10 values\n");
    for(i=0;i<=9;i++)
    scanf("%d",&ar[i]);
    printf("Enter the element to search\n");
    scanf("%d",&a);
    f=0; 
    l=9;
    for(i=0;i<9;i++)
    {
        for(j=0;j<9-i;j++)
        {
            if(ar[j]>ar[j+1])
            {
                swap=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=swap;
            }
        }
    }
    while(f<=l)
    {
        mid=(f+l)/2;
        if(ar[mid]<a)
        f=mid+1;
        if(ar[mid]>a)
        l=mid-1;
        if(ar[mid]==a)
        {
        printf("Number Found");
        k=1;
        break;
        }
    }
    if(k==0)
    printf("Number Not Found");
    return 0;
}