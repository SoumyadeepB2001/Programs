#include <stdio.h>

void selection_sort(int arr[], int n)
{
    int i, j, min;

    for (i = 0; i < n - 1; i++)
    {
        min = i;

        for (j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[min])
                min = j;
        }

        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
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

    selection_sort(arr, n);

    printf("Sorted elements in ascending:\n");

    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}