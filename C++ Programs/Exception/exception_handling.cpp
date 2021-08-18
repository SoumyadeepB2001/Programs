#include <iostream>
using namespace std;

int main()
{
    int a, b, div, prod, sum, diff;
    cout<<"Enter two numbers"<<endl;
    cin>>a>>b;

    div=a/b;
    cout<<"Division = "<<div<<endl;
    prod=a*b;
    cout<<"Product = "<<prod<<endl;
    diff=a-b;
    cout<<"Difference = "<<diff<<endl;
    sum=a+b;
    cout<<"Addition = "<<sum<<endl;
    return 0;
}