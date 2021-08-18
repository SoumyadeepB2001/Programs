#include <iostream>
using namespace std;

template <class T>
void Sum(T a[], int length)
{
    T sum = 0;
    for(int i=0; i<length; i++)
    {
        sum = sum + a[i];
    }
    cout<<"Sum of the given array is "<<sum<<endl;
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
    
    Sum(a,n);
    Sum(b,m);

    return 0;
}