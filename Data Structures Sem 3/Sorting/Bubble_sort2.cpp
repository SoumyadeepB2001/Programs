#include <iostream>
using namespace std;
class Bubble_sort
{
	float ar[50];
	int len;

public:
	Bubble_sort();
	Bubble_sort(int x);
	void inputArray();
	void inputLength();
	void sort();
	void display();
};

Bubble_sort::Bubble_sort()
{
	len = 6;
}

Bubble_sort::Bubble_sort(int x)
{
	len = x;
}

void Bubble_sort ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void Bubble_sort::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
		cin >> ar[i];
}

void Bubble_sort::sort()
{
	float temp;
	int comp = 0, swap = 0;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len - i - 1; j++)
		{
			comp++;
			if (ar[j] > ar[j + 1])
			{
				swap++;
				temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
			}
		}
	}
	cout << "Number of comparisons = " << comp << endl
		 << "Number of swaps = " << swap << endl;
}

void Bubble_sort::display()
{
	cout << "Value of the array is ";
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

int main()
{
	cout << "Default Constructor" << endl;
	Bubble_sort ob;
	ob.inputArray();
	ob.display();
	ob.sort();
	cout << "After sorting ";
	ob.display();

	cout << "Parameterised Constructor" << endl;
	Bubble_sort ob1(5);
	ob1.inputArray();
	ob1.display();
	ob1.sort();
	cout << "After sorting ";
	ob1.display();

	cout << "Input length function" << endl;
	Bubble_sort ob2;
	ob2.inputLength();
	ob2.inputArray();
	ob2.display();
	ob2.sort();
	cout << "After sorting ";
	ob2.display();
	return 0;
}