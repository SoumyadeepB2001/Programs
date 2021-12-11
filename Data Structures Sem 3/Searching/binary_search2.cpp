#include <iostream>
using namespace std;
class BinarySearch
{
public:
	int ar[50], len, comp;
	BinarySearch();
	BinarySearch(int x);
	void inputLength();
	void inputArray();
	void binary_search(int);
	void display();
};

BinarySearch ::BinarySearch()
{
	len = 5;
}

BinarySearch ::BinarySearch(int x)
{
	len = x;
}

void BinarySearch ::inputLength()
{
	cout << "Enter the length of the array" << endl;
	cin >> len;
}

void BinarySearch ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		cin >> ar[i];
	}
}

void BinarySearch ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
		cout << ar[i] << " ";
	cout << endl;
}

void BinarySearch ::binary_search(int value)
{
	int first = 0, last = len - 1, mid;
	comp = 0;
	while (first <= last)
	{
		mid = (first + last) / 2;
		comp++;
		if (ar[mid] == value)
		{
			cout << value << " Found" << endl;
			cout << "Number of comparisons = " << comp << endl;
			return;
		}
		else if (value < ar[mid])
			last = mid - 1;
		else
			first = mid + 1;
	}
	cout << "Value Not Found" << endl;
	cout << "Number of comparisons = " << comp << endl;
}

int main()
{
	BinarySearch ob;
	ob.inputLength();
	ob.inputArray();
	ob.display();
	float avg;
	int sum = 0;
	for (int i = 0; i < ob.len; i++)
	{
		ob.binary_search(ob.ar[i]);
		sum += ob.comp;
	}
	avg = (float)sum / ob.len;
	cout << "Average of all comparisons = " << avg << endl;
	return 0;
}
