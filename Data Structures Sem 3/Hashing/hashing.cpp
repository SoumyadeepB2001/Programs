#include<iostream>
using namespace std;

int main()
{
	int ar[10],i,len,a,b;
	cout<<"Enter a number"<<endl;
	cin>>len;
	for(i=0;i<10;i++)
	{
		ar[i]=0;
	}
	cout<<"Enter the values of the array"<<endl;
	for(i=0;i<len;i++)
	{
		cin>>a;
		b=a%10;
		ar[b]=a;
	}
	cout<<"Enter the elements of the array"<<endl;
	for(i=0;i<10;i++)
	{
		cout<<ar[i]<<" ";
	}
	cout<<endl;
}
