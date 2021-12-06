#include <iostream>
using namespace std;

class Selection_sort
{
	int ar[20], len;

public:
	Selection_sort();
	Selection_sort(int x);
	void input();
	void ascending_sort();
	void descending_sort();
	void display();
};

Selection_sort ::Selection_sort()
{
	len = 5;
}

Selection_sort ::Selection_sort(int x)
{
	len = x;
}

void Selection_sort ::input()
{
	cout << "Enter the elements:" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void Selection_sort ::ascending_sort()
{
	int temp;
	int i, j;
	for (i = 1; i < len; i++)
	{
		temp = ar[i];
		for (j = i - 1; j >= 0; j--)
		{
			if (temp < ar[j])
			{
				ar[j + 1] = ar[j];
			}
			else
				break;
		}
		ar[j + 1] = temp;
	}
}

void Selection_sort ::descending_sort()
{
	int temp;
	int i, j;
	for (i = 1; i < len; i++)
	{
		temp = ar[i];
		for (j = i - 1; j >= 0; j--)
		{
			if (temp > ar[j])
			{
				ar[j + 1] = ar[j];
			}
			else
				break;
		}
		ar[j + 1] = temp;
	}
}

void Selection_sort::display()
{
	cout << "The elements are:" << endl;
	for (int i = 0; i < len; i++)
	{
		cout << ar[i] << endl;
	}
}

int main()
{
	Selection_sort ob;
	ob.input();
	cout << "Before Sorting" << endl;
	ob.display();
	ob.ascending_sort();
	cout << "After sorting in Ascending Order" << endl;
	ob.display();
	ob.descending_sort();
	cout << "After sorting in Descending Order" << endl;
	ob.display();
	return 0;
}