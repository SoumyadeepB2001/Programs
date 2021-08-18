#include <iostream>
using namespace std;

void largest_int(int a[], int n)
{
    int max=a[0];
    for(int i=1; i<n; i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    cout<<"Largest = "<<max<<endl;
}

void largest_float(float a[], int n)
{
    float max=a[0];
    for(int i=1; i<n; i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    cout<<"Largest = "<<max<<endl;
}

void smallest_int(int a[], int n)
{
    int min=a[0];
    for(int i=1; i<n; i++)
    {
        if(a[i]<min)
            min=a[i];
    }
    cout<<"Smallest = "<<min<<endl;
}

void smallest_float(float a[], int n)
{
    float min=a[0];
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
    
    largest_int(a,n);
    smallest_int(a,n);
    largest_float(b,m);
    smallest_float(b,m);

    return 0;
}

