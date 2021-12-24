#include <iostream>
using namespace std;

int main()
{
	int h[10],j,a,b,c,len;
	for(int i=0;i<10;i++)
	{
		h[i]=-99;
	}
	cout<<"Enter the length"<<endl;
	cin>>len;
	
	cout<<"Enter the elements"<<endl;
	for(int i=0; i<len; i++)
	{
		cin>>a;
		b=a%10;
		if(h[b]==-99)
			h[b]=a;
		else
		{
			j=1;
			while(1)
			{
				c=(b+j)%10;
				if(h[c]==-99)
				{
					h[c]=a;
					break;
				}
				j++;
			}
		}
	}
	for(int i=0;i<10;i++)
	{
		cout<<h[i]<<" ";
	}
	cout<<endl;
}
