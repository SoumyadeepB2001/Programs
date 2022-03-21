#include <iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

class AllSort2
{
public:
	int ar1[100], ar2[100], ar3[100], len, comp1, comp2, comp3;
	AllSort2();
	AllSort2(int x);
	void inputArray();
	void bubble_sort(int[]);
	void insertion_sort(int[]);
	void selection_sort(int[]);
	void display(int[]);
};

AllSort2 ::AllSort2(int x)
{
	len = x;
	comp1=0;
	comp2=0;
	comp3=0;
}

void AllSort2 ::inputArray()
{
	for (int i = 0; i < len; i++)
	{
		ar1[i]=rand()%(2*len);
		ar2[i] = ar1[i];
		ar3[i] = ar1[i];
	}
}

void AllSort2::display(int a[])
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
}

void AllSort2::bubble_sort(int a[])
{
	int temp;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len - i - 1; j++)
		{
			comp1++;
			if (a[j] > a[j + 1])
			{
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	cout << "Value of the array after bubble sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for bubble sort = " << comp1 << endl;
}
void AllSort2::insertion_sort(int a[])
{
	int temp, i, j;
	for (i = 1; i < len; i++)
	{
		temp = a[i];
		for (j = i - 1; j >= 0; j--)
		{
			comp2++;
			if (temp < a[j])
			{
				a[j + 1] = a[j];
			}
			else
				break;
		}
		a[j + 1] = temp;
	}

	cout << "Value of the array after insertion sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for insertion sort = " << comp2 << endl;
}
void AllSort2::selection_sort(int a[])
{
	int i, j, min, minIndex;
	for (i = 0; i < len; i++)
	{
		min = a[i];
		minIndex = i;
		for (j = i + 1; j < len; j++)
		{
			comp3++;
			if (min > a[j])
			{
				min = a[j];
				minIndex = j;
			}
		}
		if (i != minIndex)
		{
			int temp = a[i];
			a[i] = min;
			a[minIndex] = temp;
		}
	}
	cout << "Value of the array after selection sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for selection sort = " << comp3 << endl;
}

int main()
{
	AllSort2 ob1(100);

	ob1.inputArray();
	
	cout << "Before bubble sorting ";
	ob1.display(ob1.ar1);
	ob1.bubble_sort(ob1.ar1);

	cout << "Before insertion sorting ";
	ob1.display(ob1.ar2);
	ob1.insertion_sort(ob1.ar2);

	cout << "Before selection sorting ";
	ob1.display(ob1.ar3);
	ob1.selection_sort(ob1.ar3);

	return 0;
}
