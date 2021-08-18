#include<stdio.h>
int main()
{
    int l,c,i,u;
    printf("Enter lower and upper limits\n");
    scanf("%d %d",&l,&u);
    while(l<=u)
    {
        i=1;
        c=0;
        while(i<=l)
        {
            if(l%i==0)
            {
                c++;
            }
                i++;
        }
        if(c==2)
        printf("%d ",l);
        l++;
    }
    return 0;
}