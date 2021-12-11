#include<iostream>
using namespace std;

int lsearch(int ar[], int v)
{
	int c=0;
	for(int i=0; i<10; i++)
	{
		c++;
		if(v==ar[i])
			break;
	}
	return c;
}

int hashing(int ar[], int v)
{
	int c=0;
	if(ar[v%10]==v)
	{
		cout<<"Value Found"<<endl;
		return 1;
	}
	else
	{
		cout<<"Value not Found"<<endl;
		return 10;
	}
}

int main()
{
	int ar[10],i,c1=0,c2,v,a,b,len;
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
	cout<<"Enter the value to be searched"<<endl;
	cin>>v;
	c1=lsearch(ar,v);
	cout<<"Comparison of Linear Search = "<<c1<<endl;
	c2=hashing(ar,v);
	cout<<"Comparison of Hashing = "<<c2<<endl;
}
