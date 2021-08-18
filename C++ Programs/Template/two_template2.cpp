#include <iostream>
using namespace std;

template <class T1, class T2>
void f(T1 a, T2 c)
{
    cout<<a<<"\t"<<c<<endl;
}

int main()
{
    f(5, 'A');
    f(5, 5.5);
    f('A', 5.5);

    return 0;
}