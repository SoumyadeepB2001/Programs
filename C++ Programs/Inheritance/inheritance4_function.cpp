#include <iostream>
using namespace std;

class cl1
{
    public:
    void f1()
    {
        cout<<"Base Class"<<endl;
    }
};

class cl2:public cl1
{
    public:
    void f2()
    {
        cout<<"Derived class"<<endl;
    }
};

int main()
{
    cl1 ob1;
    ob1.f1();
    cl2 ob2;
    ob2.f1();
    ob2.f2();
    return 0;
}