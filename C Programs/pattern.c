#include <stdio.h>
int main()
{
   int i,j,k;
   for(i=1;i<=4;i++)
   {
       for(j=4;j>i;j--)
       {
          printf(" ");
       }
       for(k=1;k<=i;k++)
       {
           printf("%d ",i);
       }
       printf("\n");
   }
   for(i=3;i>=1;i--)
   {
       for(j=3;j>i;j--)
       {
          printf(" ");
       }
   for(k=1;k<=i;k++)
   {
       printf(" %d",i);
   }
   printf("\n");
   }
    return 0;
}