/*
Data member - array[], len
Functions - inputLenght(), inputArray(), sort(), display() 
*/

#include<iostream>
using namespace std;

class LinearSearch
{
	int ar[50], len;
	public:
	
	LinearSearch();
	LinearSearch(int x);
	void inputLength();
	void inputArray();
	void linear_search();
	void display();
};

LinearSearch :: LinearSearch()
{
	len = 5;
}

LinearSearch :: LinearSearch(int x)
{
	len = x;
}

void LinearSearch :: inputLength()
{
	cout<<"Enter the length of the array"<<endl;
	cin>>len;
}

void LinearSearch :: inputArray()
{
	cout<<"Enter the elements of the array"<<endl;
	for(int i=0; i<len; i++)
	{
		cin>>ar[i];
	}
}

void LinearSearch :: display()
{
	cout<<"Value of the array is"<<endl;
	for(int i=0; i<len; i++)
		cout<<ar[i]<<" ";
	cout<<endl;
}

void LinearSearch :: linear_search()
{
	int i,value,index,flag=0;
	cout<<"Enter the value to be searched"<<endl;
	cin>>value;
	
	for(i = 0; i<len; i++)
	{
		if(ar[i]==value)
		{
			index=i;
			flag = 1;
			break;
		}
	}
	if(flag == 0)
		cout<<"Not found"<<endl;
	else
		cout<<value<<" is found at index "<<index<<endl;
}

int main()
{
	cout<<"Default Constructor"<<endl;
	LinearSearch ob;
	ob.inputArray();
	ob.display();
	ob.linear_search();
	
	cout<<"Parameterised Constructor"<<endl;
	LinearSearch ob1(4);
	ob1.inputArray();
	ob1.display();
	ob1.linear_search();
	
	cout<<"Input length function"<<endl;
	LinearSearch ob2;
	ob2.inputLength();
	ob2.inputArray();
	ob2.display();
	ob2.linear_search();
}
