#include <iostream>
using namespace std;

class AllSort
{
public:
	int ar1[20], ar2[20], ar3[20], len, comp1 = 0, comp2 = 0, comp3 = 0;
	AllSort();
	AllSort(int x);
	void inputArray();
	void bubble_sort(int[]);
	void insertion_sort(int[]);
	void selection_sort(int[]);
	void display(int[]);
};

AllSort ::AllSort()
{
	len = 6;
}

AllSort ::AllSort(int x)
{
	len = x;
}

void AllSort ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar1[i];
		ar2[i] = ar1[i];
		ar3[i] = ar1[i];
	}
}

void AllSort::display(int a[])
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
}

void AllSort::bubble_sort(int a[])
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
	cout << "Value of the array after sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for bubble sort = " << comp1 << endl;
}
void AllSort::insertion_sort(int a[])
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

	cout << "Value of the array after sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for insertion sort = " << comp2 << endl;
}
void AllSort::selection_sort(int a[])
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
	cout << "Value of the array after sorting is" << endl;
	for (int i = 0; i < len; i++)
		cout << a[i] << " ";
	cout << endl;
	cout << "Number of comparisons for selection sort = " << comp3 << endl;
}

int main()
{
	AllSort ob, ob1, ob2, ob3;

	cout << "Default Constructor" << endl;
	ob.inputArray();
	cout << "Before bubble sorting ";
	ob1.display(ob.ar1);
	ob1.bubble_sort(ob.ar1);

	cout << "Before selection sorting ";
	ob2.display(ob.ar3);
	ob2.selection_sort(ob.ar3);

	cout << "Before insertion sorting ";
	ob3.display(ob.ar2);
	ob3.insertion_sort(ob.ar2);

	if (ob1.comp1 <= ob3.comp2 && ob1.comp1 <= ob2.comp3)
		cout << "Bubble sort has the least comparisons";
	else if (ob3.comp2 <= ob1.comp1 && ob3.comp2 <= ob2.comp3)
		cout << "Insertion sort has the least comparisons";
	else
		cout << "Selection sort has the least comparisons";

	cout << "\nParameterized Constructor" << endl;
	AllSort obb(5), obb1(5), obb2(5), obb3(5);
	obb.inputArray();
	cout << "Before bubble sorting ";
	obb1.display(obb.ar1);
	obb1.bubble_sort(obb.ar1);

	cout << "Before selection sorting ";
	obb2.display(obb.ar3);
	obb2.selection_sort(obb.ar3);

	cout << "Before insertion sorting ";
	obb3.display(obb.ar2);
	obb3.insertion_sort(obb.ar2);

	if (obb1.comp1 <= obb3.comp2 && obb1.comp1 <= obb3.comp3)
		cout << "Bubble sort has the least comparisons";
	else if (obb3.comp2 <= obb1.comp1 && obb3.comp2 <= obb2.comp3)
		cout << "Insertion sort has the least comparisons";
	else
		cout << "Selection sort has the least comparisons";
	return 0;
}
