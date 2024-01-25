#include <stdio.h>

void insertion_sort(int arr[], int n)
{
    int i, j, temp;
    for(i=1;i<n;i++)
    {
        temp=arr[i];
        if(temp<arr[i-1])
        {
            for(j=i;j>0;j--)
            {
                if(temp<arr[j-1])
                {
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

int main()
{
    int i, n;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the elements:\n");

    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    insertion_sort(arr, n);

    printf("Sorted elements in ascending:\n");

    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}