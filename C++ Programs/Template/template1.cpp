
#include <iostream>
using namespace std;
void Int_Sum(int a[],int length)
{
    int sum=0;
    for(int i=0; i<length; i++)
        sum = sum + a[i];
    
    cout<<"The sum of the array is "<<sum<<endl;
}
void Float_Sum(float a[],int length)
{
    float sum=0;
    for(int i=0; i<length; i++)
        sum = (float) sum + a[i];
    
    cout<<"The sum of the array is "<<sum<<endl;
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
    Int_Sum(a,n);
    Float_Sum(b,m);
    return 0;
}