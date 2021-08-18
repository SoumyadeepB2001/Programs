#include <iostream>
using namespace std;
void f1(int a, char c)
{
    cout<<a<<"\t"<<c<<endl;
}

void f2(int a, double d)
{
    cout<<a<<"\t"<<d<<endl;
}

void f3(char c, double d)
{
    cout<<c<<"\t"<<d<<endl;
}
int main()
{
    f1(5, 'A');
    f2(5, 5.5);
    f3('A', 5.5);
    return 0;
}