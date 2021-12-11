#include <iostream>
using namespace std;
class Insertion_sort
{
	int ar[20], len;

public:
	Insertion_sort();
	Insertion_sort(int x);
	void inputLength();
	void inputArray();
	void sort();
	void display();
};

Insertion_sort ::Insertion_sort()
{
	len = 4;
}

Insertion_sort ::Insertion_sort(int x)
{
	len = x;
}

void Insertion_sort ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void Insertion_sort ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void Insertion_sort ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

void Insertion_sort ::sort()
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

int main()
{
	cout << "Default Constructor" << endl;
	Insertion_sort ob;
	ob.inputArray();
	ob.display();
	ob.sort();
	cout << "After sorting ";
	ob.display();

	cout << "Parameterized Constructor" << endl;
	Insertion_sort ob1(5);
	ob1.inputArray();
	ob1.display();
	ob1.sort();
	cout << "After sorting ";
	ob1.display();

	cout << "Input length function" << endl;
	Insertion_sort ob2;
	ob2.inputLength();
	ob2.inputArray();
	ob2.display();
	ob2.sort();
	cout << "After sorting ";
	ob2.display();
}