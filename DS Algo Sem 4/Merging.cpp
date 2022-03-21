#include <iostream>
using namespace std;
class cl
{
	int l1, l2, l3, ar1[50], ar2[50], ar3[100];

public:
	cl();
	cl(int x, int y);
	void inputLength();
	void inputArray();
	void disp1();
	void disp2();
	void disp3();
	void disp3_5();
	void disp4();
	void disp5();
};
cl::cl()
{
	l1 = 3;
	l2 = 7;
	l3 = 0;
}
cl::cl(int x, int y)
{
	l1 = x;
	l2 = y;
}
void cl::inputLength()
{
	cout << "Enter the length of the 1st array" << endl;
	cin >> l1;
	cout << "Enter the length of the 2nd array" << endl;
	cin >> l2;
}
void cl::inputArray()
{
	cout << "Enter the elements of the 1st array" << endl;
	for (int i = 0; i < l1; i++)
	{
		cin >> ar1[i];
	}
	cout << "Enter the elements of the 2nd array" << endl;
	for (int i = 0; i < l2; i++)
	{
		cin >> ar2[i];
	}
}
void cl::disp1()
{
	int c = 0;
	for (int i = 0; i < l1; i++)
	{
		ar3[i] = ar1[i];
		c++;
	}
	for (int i = 0; i < l2; i++)
	{
		ar3[c] = ar2[i];
		c++;
	}
	cout << "Output 1" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < c; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
void cl::disp2()
{
	int c = 0;
	for (int i = 0; i < l2; i++)
	{
		ar3[i] = ar2[i];
		c++;
	}
	for (int i = 0; i < l1; i++)
	{
		ar3[c] = ar1[i];
		c++;
	}
	cout << "Output 2" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < c; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
void cl::disp3()
{
	int i = 0, j = 0, k = 0;
	while (i < l1 && j < l2)
	{
		if (k % 2 == 0)
		{
			ar3[k] = ar1[i];
			k++;
			i++;
		}
		else
		{
			ar3[k] = ar2[j];
			k++;
			j++;
		}
	}
	while (i < l1)
	{
		ar3[k] = ar1[i];
		k++;
		i++;
	}
	while (j < l2)
	{
		ar3[k] = ar2[j];
		k++;
		j++;
	}
	cout << "Output 3" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < k; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
void cl::disp3_5()
{
	int i = 0, j = 0, k = 0;
	while (i < l1 && j < l2)
	{
		if (k % 2 == 0)
		{
			ar3[k] = ar2[j];
			k++;
			j++;
		}
		else
		{
			ar3[k] = ar1[i];
			k++;
			i++;
		}
	}
	while (j < l2)
	{
		ar3[k] = ar2[j];
		k++;
		j++;
	}
	while (i < l1)
	{
		ar3[k] = ar1[i];
		k++;
		i++;
	}
	cout << "Output 4" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < k; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
void cl::disp4()
{
	int i = 0, j = 0, k = 0;
	while (i < l1 && j < l2)
	{
		if (ar1[i] < ar2[j])
		{
			ar3[k] = ar1[i];
			k++;
			i++;
		}
		else
		{
			ar3[k] = ar2[j];
			k++;
			j++;
		}
	}
	while (i < l1)
	{
		ar3[k] = ar1[i];
		k++;
		i++;
	}
	while (j < l2)
	{
		ar3[k] = ar2[j];
		k++;
		j++;
	}
	cout << "Output 5" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < k; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
void cl::disp5()
{
	int i = 0, j = 0, k = 0;
	while (i < l1 && j < l2)
	{
		if (ar1[i] == ar2[j])
		{
			ar3[k] = ar1[i];
			k++;
			i++;
			j++;
		}
		else
		{
			if (ar1[i] > ar2[j])
			{
				ar3[k] = ar2[j];
				k++;
				j++;
			}
			else
			{
				ar3[k] = ar1[i];
				k++;
				i++;
			}
		}
	}
	while (i < l1)
	{
		ar3[k] = ar1[i];
		k++;
		i++;
	}
	while (j < l2)
	{
		ar3[k] = ar2[j];
		k++;
		j++;
	}
	cout << "Output 6" << endl;
	cout << "Third array is : " << endl;
	for (int i = 0; i < k; i++)
	{
		cout << ar3[i] << " ";
	}
	cout << endl;
}
int main()
{
	cl ob;
	ob.inputArray();
	ob.disp1();
	ob.disp2();
	ob.disp3();
	ob.disp3_5();
	ob.disp4();
	ob.disp5();
	return 0;
}