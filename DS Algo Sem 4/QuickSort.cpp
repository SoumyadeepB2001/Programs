#include <iostream>
using namespace std;
#define MAX 50
class QuickSort
{
public:
	int a[MAX], n;
	void quickSort(int, int);
	int partition(int, int);
	void input();
	void output();
	int returnLength();
};

void QuickSort::quickSort(int beg, int end)
{
	int pivot;
	if (beg < end)
	{
		pivot = partition(beg, end);
		quickSort(beg, pivot - 1);
		quickSort(pivot + 1, end);
	}
}

int QuickSort::partition(int beg, int end)
{
	int pivotItem, i, j, temp;
	pivotItem = a[beg];
	i = beg;
	for (j = beg + 1; j <= end; j++)
	{
		if (a[j] <= pivotItem)
		{
			i++;
			if (i != j)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	temp = a[beg];
	a[beg] = a[i];
	a[i] = temp;
	return i;
}

void QuickSort::input()
{
	int i;
	cout << "Enter the number of elements" << endl;
	cin >> n;
	cout << "Enter " << n << " elements" << endl;
	for (i = 0; i < n; i++)
		cin >> a[i];
}

void QuickSort::output()
{
	int i;
	cout << "Sorted Array:" << endl;
	for (i = 0; i < n; i++)
		cout << a[i] << endl;
}

int QuickSort::returnLength()
{
	return n;
}

int main()
{
	QuickSort ob;
	ob.input();
	int n = ob.returnLength();
	ob.quickSort(0, n - 1);
	ob.output();
}