#include <iostream>
using namespace std;

template <class T>
void Rev(T a[],int length)
{
    cout<<"Reversed array is"<<endl;
    for(int i=length-1; i>=0; i--)
    {
        cout<<a[i]<<"\t";
    }
    cout<<endl;   
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
    
    Rev(a,n);
    Rev(b,m);

    return 0;
}