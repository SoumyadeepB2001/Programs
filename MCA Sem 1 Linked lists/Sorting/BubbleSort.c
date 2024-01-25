#include<stdio.h>
#include<conio.h>
void bubble_sort(int arr[], int n)
{
    int i, j, temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
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

    for(i=0;i<n;i++)
    {
        scanf("%d", &arr[i]);
    }

    bubble_sort(arr, n);

    printf("Sorted elements in ascending:\n");

    for(i=0;i<n;i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}