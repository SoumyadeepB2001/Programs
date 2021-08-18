#include <iostream>
using namespace std;

class cl1
{
    public:
    virtual void f()=0;     //Abstract class with pure virtual function
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
    cl2 ob2;
    ob2.f();
    return 0;
}