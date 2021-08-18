#include <iostream>
using namespace std;

void swap(int a, int b)
{
    cout<<"Before swapping a = "<<a<<" b = "<<b<<endl;
    int temp=a;
    a=b;
    b=temp;
    cout<<"After swapping a = "<<a<<" b = "<<b<<endl;
}

void swap(double a, double b)
{
    cout<<"Before swapping a = "<<a<<" b = "<<b<<endl;
    double temp=a;
    a=b;
    b=temp;
    cout<<"After swapping a = "<<a<<" b = "<<b<<endl;
}

void swap(char a, char b)
{
    cout<<"Before swapping a = "<<a<<" b = "<<b<<endl;
    char temp=a;
    a=b;
    b=temp;
    cout<<"After swapping a = "<<a<<" b = "<<b<<endl;
}

int main()
{
    cout<<"Swap for Integer"<<endl;
    swap(5,7);
    cout<<"Swap for Double"<<endl;
    swap(5.5,7.7);
    cout<<"Swap for Character"<<endl;
    swap('A','B');
    return 0;
}