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
    cl1 ob1;
    ob1.f();
    cl2 ob2;
    ob2.f();
    return 0;
}