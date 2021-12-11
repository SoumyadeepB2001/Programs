/*
Data member - array[], len
Functions - inputLenght(), inputArray(), sort(), display()
*/

#include <iostream>
using namespace std;
class Selection_sort
{
	int ar[50];
	int len;

public:
	Selection_sort();
	Selection_sort(int x);
	void inputLength();
	void inputArray();
	void ascendingSort();
	void descendingSort();
	void display();
};

Selection_sort ::Selection_sort()
{
	len = 4;
}

Selection_sort ::Selection_sort(int x)
{
	len = x;
}

void Selection_sort ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void Selection_sort ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void Selection_sort ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

void Selection_sort ::ascendingSort()
{
	int i, j, minIndex;
	int min;
	for (i = 0; i < len; i++)
	{
		min = ar[i];
		minIndex = i;
		for (j = i + 1; j < len; j++)
		{
			if (min > ar[j])
			{
				min = ar[j];
				minIndex = j;
			}
		}
		if (i != minIndex)
		{
			int temp = ar[i];
			ar[i] = min;
			ar[minIndex] = temp;
		}
	}
}

void Selection_sort ::descendingSort()
{
	int i, j, minIndex;
	int min;
	for (i = 0; i < len; i++)
	{
		min = ar[i];
		minIndex = i;
		for (j = i + 1; j < len; j++)
		{
			if (min < ar[j])
			{
				min = ar[j];
				minIndex = j;
			}
		}
		if (i != minIndex)
		{
			int temp = ar[i];
			ar[i] = min;
			ar[minIndex] = temp;
		}
	}
}

int main()
{
	cout << "Default Constructor" << endl;
	Selection_sort ob;
	ob.inputArray();
	ob.display();
	ob.ascendingSort();
	cout << "After sorting in ascending ";
	ob.display();
	ob.descendingSort();
	cout << "After sorting in descending ";
	ob.display();

	cout << "Parameterized Constructor" << endl;
	Selection_sort ob1(5);
	ob1.inputArray();
	ob1.display();
	ob1.ascendingSort();
	cout << "After sorting in ascending ";
	ob1.display();
	ob1.descendingSort();
	cout << "After sorting in descending ";
	ob1.display();

	cout << "Input length function" << endl;
	Selection_sort ob2;
	ob2.inputLength();
	ob2.inputArray();
	ob2.display();
	ob2.ascendingSort();
	cout << "After sorting in ascending ";
	ob2.display();
	ob2.descendingSort();
	cout << "After sorting in descending ";
	ob2.display();

	return 0;
}
