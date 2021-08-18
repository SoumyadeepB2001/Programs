#include <iostream>
using namespace std;

template <class T1>
void largest(T1 a[], int n)
{
    T1 max=a[0];
    for(int i=1; i<n; i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    cout<<"Largest = "<<max<<endl;
}

template <class T2>
void smallest(T2 a[], int n)
{
    T2 min=a[0];
    for(int i=1; i<n; i++)
    {
        if(a[i]<min)
            min=a[i];
    }
    cout<<"Smallest = "<<min<<endl;
}

int main()
{
    int a[20],n,m;
    float b[20];

    cout<<"Enter the number of elements you want to give in the Integer array"<<endl;
    cin>>n;
    cout<<"Enter the elements of the array"<<endl;
    for(int i=0; i<n; i++)
        cin>>a[i];
    
    cout<<"Enter the number of elements you want to give in the Float array"<<endl;
    cin>>m;
    cout<<"Enter the elements of the array"<<endl;
    for(int i=0; i<m; i++)
        cin>>b[i];
    
    largest(a,n);
    smallest(a,n);
    largest(b,m);
    smallest(b,m);

    return 0;
}
