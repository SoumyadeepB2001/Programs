#include <stdio.h>
int main()
{
    int a[10],i,j,temp,n;
    printf("Enter the elements of the array \n");
    for (int i=0;i<10;i++)
        scanf("%d", &a[i]);

    printf("Before Sorting: ");
    for (int i=0;i<10;i++)
        printf("%d ", a[i]);
        
    for (i=1;i<10;i++)
    {
        temp=a[i];
        j=i-1;
        while (j>=0&&a[j]>temp)
        {
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=temp;
    }
    printf("\nAfter Sorting: ");
    for (int i=0;i<10;i++)
        printf("%d ", a[i]);
    return 0;
}

