#include <stdio.h>

int main()
{
    int i,j,n;
    printf("Enter matrix dimensions\n");
    scanf("%d",&n);
   int ar[n][n];
   printf("Enter matrix elements\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
        scanf("%d",&ar[i][j]);
     }
   }
   printf("The Matrix is:\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
       printf("%d\t",ar[i][j]);
     }
     printf("\n");
   }
}