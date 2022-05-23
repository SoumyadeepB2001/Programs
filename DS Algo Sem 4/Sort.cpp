#include <iostream>
#include <stdio.h>
#include <time.h>
#include <cstring>
#include <cstdlib>
using namespace std;
class Sort
{
public:
    int ar[10][10];
    void input();
    void output();
    void bubbleSort();
};

void Sort::input()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            ar[i][j] = rand() % 100 + 1;
        }
    }
}

void Sort::bubbleSort()
{
    int temp, i, j, k;
    for (i = 0; i < 10; i++)
    {
        for (j = 0; j < 10; j++)
        {
            for (k = 0; k < 10; k++)
            {
                if (ar[i][k] > ar[i][k + 1])
                {
                    temp = ar[i][k];
                    ar[i][k] = ar[i][k + 1];
                    ar[i][k + 1] = temp;
                }
            }
        }
    }
}

void Sort::output()
{
    for (int i = 0; i < 10; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            printf("%d\t", ar[i][j]);
        }
        cout << endl;
    }
}

int main()
{
    Sort ob;
    ob.input();
    cout << "The array before sorting every row" << endl;
    ob.output();
    ob.bubbleSort();
    cout << "The array after sorting every row" << endl;
    ob.output();
    return 0;
}