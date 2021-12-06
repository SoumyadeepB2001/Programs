#include <iostream>
using namespace std;

class Triangle
{
public:
	int len;
	char ar[50][50];
	Triangle();
	Triangle(int x);
	void inputArray();
	void display();
	void lower_left();
	void upper_left();
	void upper_right();
	void lower_right();
};

Triangle ::Triangle()
{
	len = 4;
}

Triangle ::Triangle(int x)
{
	len = x;
}

void Triangle ::inputArray()
{
	cout << "Enter the elements of the array" << endl;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len; j++)
			cin >> ar[i][j];
	}
}

void Triangle ::display()
{
	cout << "Value of the array is" << endl;
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j < len; j++)
			cout << ar[i][j] << " ";
		cout << endl;
	}
}

void Triangle ::lower_left()
{
	int c = 0;
	cout << "The Lower Left Triangle:\n";
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j <= c; j++)
		{
			cout << ar[i][j] << " ";
		}
		c++;
	}
	cout<<"\n";
}

void Triangle ::upper_left()
{
	int c = len-1;
	cout << "The Upper Left Triangle:\n";
	for (int i = 0; i < len; i++)
	{
		for (int j = 0; j <= c; j++)
		{
			cout << ar[i][j] << " ";
		}
		c--;
	}
	cout<<"\n";
}

void Triangle ::upper_right()
{
	int c = 0;
	cout << "The Upper Right Triangle:\n";
	for (int i = 0; i < len; i++)
	{
		for (int j = c; j <len; j++)
		{
			cout << ar[i][j] << " ";
		}
		c++;
	}
	cout<<"\n";
}

void Triangle ::lower_right()
{
	int c = len-1;
	cout << "The Lower Right Triangle:\n";
	for (int i = 0; i < len; i++)
	{
		for (int j = c; j <len; j++)
		{
			cout << ar[i][j] << " ";
		}
		c--;
	}
	cout<<"\n";
}

int main()
{
	cout << "Default Constructor" << endl;
	Triangle ob;
	ob.inputArray();
	ob.display();
	ob.lower_left();
	ob.upper_left();
	ob.upper_right();
	ob.lower_right();

	cout << "\nParameterised Constructor" << endl;
	Triangle ob1(5);
	ob1.inputArray();
	ob1.display();
	ob1.lower_left();
	ob1.upper_left();
	ob1.upper_right();
	ob1.lower_right();
}
