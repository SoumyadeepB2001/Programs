#include <iostream>
using namespace std;
#define max 50
class RadixSort
{
public:
    int ar[max], n, i;
    void radixsort(int[], int);
    void input();
    void output();
};

void RadixSort::input()
{
    cout << "Enter the number of elements: " << endl;
    cin >> n;
    cout << "Enter " << n << " elements" << endl;
    for (i = 0; i < n; i++)
        cin >> ar[i];

    radixsort(ar, n);
}

void RadixSort::output()
{
    cout << "The sorted array is" << endl;
    for (i = 0; i < n; i++)
        cout << ar[i] << " ";
}
void RadixSort::radixsort(int a[], int m)
{
    int bucket[10][8], buck[10];
    int i, j, k, l, num, div, big, pass;
    div = 1;
    num = 0;
    big = a[0];
    for (i = 0; i < m; i++)
    {
        if (a[i] > big)
            big = a[i];
    }
    while (big > 0)
    {
        num = num + 1;
        big = big / 10;
    }
    for (pass = 0; pass < num; pass++)
    {
        for (k = 0; k < 10; k++)
            buck[k] = 0;
        for (i = 0; i < m; i++)
        {
            l = (a[i] / div) % 10;
            bucket[l][buck[l]++] = a[i];
        }
        i = 0;
        for (k = 0; k < 10; k++)
        {
            for (j = 0; j < buck[k]; j++)
                a[i++] = bucket[k][j];
        }
        div = div * 10;
    }
}

int main()
{
    RadixSort ob;
    ob.input();
    ob.output();
    return 0;
}
