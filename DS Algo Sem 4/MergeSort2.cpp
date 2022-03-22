#include <iostream>
using namespace std;
#define MAX 50

class cl
{
	public:
	int a[MAX], n;
	void mergeSort(int, int);
	void merge(int, int, int);
	void input();
	void output();
	int returnLength();
};

// merge sort function
void cl::mergeSort(int beg, int end)
{
	int mid;
	if(beg<end)
	{
		mid = (beg+end)/2;
		mergeSort(beg,mid);
		mergeSort(mid+1,end);
		merge(beg,mid,end);
	}
}
/*merging function*/
void cl::merge(int beg, int mid, int end)
{
	int b[MAX],l,r,i;
	l = beg;
	r = mid + 1;
	i = beg;
	while((l<=mid) && (r<=end))
	{
		if(a[l]<a[r])
		{
			b[i++] = a[l++];
		}
		else
		{
			b[i++] = a[r++];
		}
	}
	
	while(l<=mid)
		b[i++] = a[l++];
	while(r<=end)
		b[i++] = a[r++];
	for(i=beg; i<=end; i++)
	{
		a[i] = b[i];
	}
}

void cl::input()
{
	int i;
	cout<<"Enter the number of the elements"<<endl;
	cin>>n;
	cout<<"Enter "<<n<<" elements"<<endl;
	for (i=0; i<n; i++)
	{
		cin>>a[i];
	}
}

void cl::output()
{
	int i;
	cout<<"Sorted array is"<<endl;
	for (i=0; i<n; i++)
	{
		cout<<a[i]<<endl;
	}
}

int cl::returnLength()
{
	return n;
}

int main()
{	
	cl ob;
	ob.input();
	int n = ob.returnLength();
	ob.mergeSort(0,n-1);
	ob.output();
	
}
