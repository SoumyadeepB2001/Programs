/*
Data member - array[], len
Functions - inputLenght(), inputArray(), sort(), display()
*/

#include <iostream>
using namespace std;
class LinearSearch
{
public:
	int ar[50], len, comp;
	LinearSearch();
	LinearSearch(int x);
	void inputLength();
	void inputArray();
	void linear_search(int);
	void display();
};

LinearSearch ::LinearSearch()
{
	len = 5;
}

LinearSearch ::LinearSearch(int x)
{
	len = x;
}

void LinearSearch ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void LinearSearch ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void LinearSearch ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

void LinearSearch ::linear_search(int value)
{
	int i, index, flag = 0;
	comp = 0;
	cout << "Enter the value to be searched" << endl;
	cin >> value;

	for (i = 0; i < len; i++)
	{
		comp++;
		if (ar[i] == value)
		{
			index = i;
			flag = 1;
			break;
		}
	}
	if (flag == 0)
		cout << "Value not found" << endl;
	else
		cout << value << " is found at index " << index << endl;
	cout << value << "Number of comparisons = " << comp << endl;
}

int main()
{
	LinearSearch ob;
	ob.inputLength();
	ob.inputArray();
	ob.display();
	float avg;
	int sum = 0;
	for (int i = 0; i < ob.len; i++)
	{
		ob.linear_search(ob.ar[i]);
		sum += ob.comp;
	}
	avg = (float)sum / ob.len;
	cout <<"Average of all comparisons = " << avg << endl;
	return 0;
}
