#include <stdio.h>
#include <stdbool.h>
void quicksort(int *, int, int);
void print(int *, int);
void main()
{
    int n,i,size;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    size = sizeof(arr) / sizeof(arr[0]);
    printf("Before sorting: ");
    print(arr,size);
    quicksort(arr, 0, n - 1);
    printf("After sorting: ");
    print(arr,size);
}

void quicksort(int arr[], int l, int u)
{
    int p, i, j, swap;
    bool flag = false;
    if (l < u)
    {
        p = arr[l];
        i = l + 1;
        j = u;
        flag = true;

        while (flag)
        {
            while (arr[i] < p)
            {
                i++;
            }
            while (arr[j] > p)
            {
                j--;
            }
            if (i < j)
            {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }

            else
            {
                flag = false;
            }
        }

        swap = arr[l];
        arr[l] = arr[j];
        arr[j] = swap;
        quicksort(arr, l, j - 1);
        quicksort(arr, j + 1, u);
    }
}

void print(int arr[], int size) //SizeOf operator can't work on parameter arrays
{   
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}