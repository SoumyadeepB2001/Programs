#include <iostream>
using namespace std;
#define MAX 50
void mergeSort(int [], int, int);
void merge(int [], int, int, int);

int main()
{
	int items[MAX], n,i;
	cout<<"Enter the number of the elements"<<endl;
	cin>>n;
	cout<<"Enter "<<n<<" elements..."<<endl;
	for (i=0; i<n; i++)
	{
		cin>>items[i];
	}
	mergeSort(items,0,n-1);
	cout<<"Sorted array is"<<endl;
	for (i=0; i<n; i++)
	{
		cout<<items[i]<<endl;
	}
}

// merge sort function
void mergeSort(int a[], int beg, int end)
{
	int mid;
	if(beg<end)
	{
		mid = (beg+end)/2;
		mergeSort(a,beg,mid);
		mergeSort(a,mid+1,end);
		merge(a,beg,mid,end);
	}
}
/*merging function*/
void merge(int a[], int beg, int mid, int end)
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
