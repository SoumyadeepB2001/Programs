#include <stdio.h>

int main()
{
    int i,j,n;
    printf("Enter matrix dimensions\n");
    scanf("%d",&n);
   int ar1[n][n];
   int ar2[n][n];
   int ar3[n][n];
   printf("Enter elements of the first matrix\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
        scanf("%d",&ar1[i][j]);
     }
   }
   printf("Enter elements of the second matrix\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
        scanf("%d",&ar2[i][j]);
     }
   }
   printf("The first matrix is:\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
       printf("%d\t",ar1[i][j]);
     }
     printf("\n");
   }
    printf("The second matrix is:\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
       printf("%d\t",ar2[i][j]);
     }
     printf("\n");
   }
   printf("The sum of the two matrices is:\n");
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
		 ar3[i][j]=ar1[i][j]+ar2[i][j];
       printf("%d\t",ar3[i][j]);
     }
     printf("\n");
   }
}