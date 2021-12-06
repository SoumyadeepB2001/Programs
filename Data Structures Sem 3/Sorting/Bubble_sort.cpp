#include <iostream>
using namespace std;
class Bubble_sort
{
	int ar[50], len;

public:
	Bubble_sort();
	Bubble_sort(int x);
	void input();
	void BubbleSortAscending();
	void BubbleSortDescending();
	void display();
};

Bubble_sort::Bubble_sort()
{
	len = 5;
}

Bubble_sort::Bubble_sort(int x)
{
	len = x;
}

void Bubble_sort::input()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
		cin >> ar[i];
}

void Bubble_sort::BubbleSortAscending()
{
	int temp;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len - i - 1; j++)
		{
			if (ar[j] > ar[j + 1])
			{
				temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
			}
		}
	}
}

void Bubble_sort::BubbleSortDescending()
{
	int temp;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len - i - 1; j++)
		{
			if (ar[j] < ar[j + 1])
			{
				temp = ar[j];
				ar[j] = ar[j + 1];
				ar[j + 1] = temp;
			}
		}
	}
}

void Bubble_sort::display()
{
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

int main()
{
	Bubble_sort ob;
	ob.input();
	cout << "Before Sorting" << endl;
	ob.display();
	cout << "After Sorting Ascending" << endl;
	ob.BubbleSortAscending();
	ob.display();
	cout << "After Sorting Descending" << endl;
	ob.BubbleSortDescending();
	ob.display();
	return 0;
}