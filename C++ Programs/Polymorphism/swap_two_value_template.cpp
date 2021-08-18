#include <iostream>
using namespace std;
template <class T>
void swap(T a, T b)
{
    cout<<"Before swapping a = "<<a<<" b = "<<b<<endl;
    T temp=a;
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