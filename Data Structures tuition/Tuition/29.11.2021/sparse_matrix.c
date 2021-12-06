#include <stdio.h>
int main()
{
	int a[20][20], b[40][3];		//1st row, 2nd col, 3rd value
	int z=0, nz=0;
	int r,c,i,j;
	printf("Print total number of row and column in sparse matrix \n");
	scanf("%d%d",&r, &c);
	printf("enter the number of elements \n");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			if(a[i][j]==0)
				z++;
			else
				nz++;
		}
	}
	b[0][0]=r;
	b[0][1]=c;
	b[0][2]=nz;
	int row=1;
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			if(a[i][j]!=0)
			{
				b[row][0]=i;
				b[row][1]=j;
				b[row][2]=a[i][j];
				row++;
			}
		}
	}
	
	printf("Sparse matrix output \n");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	
	printf("Sparse matrix in non zero form \n");
	for(i=0; i<row; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%d ", b[i][j]);
		}
		printf("\n");
	}
}
