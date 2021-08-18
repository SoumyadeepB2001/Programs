#include <stdio.h>
int main()
{
  int array[10],i,j,swap;
  printf("Enter 10 numbers\n");
  for (i=0;i<10;i++)
    scanf("%d", &array[i]);
  for (i=0;i<9;i++)
  {
    for (j=0;j<9-i;j++)
    {
      if (array[j] > array[j+1])
      {
        swap=array[j];
        array[j]=array[j+1];
        array[j+1]=swap;
      }
    }
  }
  printf("Sorted list in ascending order:\n");

  for (i=0;i<10;i++)
     printf("%d ", array[i]);
  return 0;
}