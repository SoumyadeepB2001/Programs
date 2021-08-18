#include <iostream>
using namespace std;

class cl1
{
    public:
    virtual void f()
    {
        cout<<"Class cl1"<<endl;
    }
};

class cl2: public cl1
{
    public:
    void f()
    {
        cout<<"Class cl2"<<endl;
    }
};

int main()
{
    cl1 *p, ob1;
    p = &ob1;
    ob1.f();
    p->f();     //Runtime polymorphism
    cl2 ob2;
    ob2.f();
    p = &ob2;   //Pointer of base class, object of derived class, only one copy of f() is available
    p->f();     //Runtime polymorphism     
    return 0;
}