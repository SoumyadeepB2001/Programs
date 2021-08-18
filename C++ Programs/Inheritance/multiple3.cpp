#include <iostream>
using namespace std;

class cl1
{
    protected:
    int a;
    public:
    void f1()
    {
        a=5;
        cout<<"a = "<<a<<endl;
    }
};

class cl2
{
    protected:
    int b;
    public:
    void f2()
    {
        b=6;
        cout<<"b = "<<b<<endl;
    }

};

class cl3:public cl1, public cl2
{
    protected:
    int c;
    public:
    void f3()
    {
        a=5,b=6,c=7;
        cout<<"a = "<<a<<" b = "<<b<<" c = "<<c<<endl;
    }

};

int main()
{
    cl1 ob1;
    ob1.f1();
    cl2 ob2;
    ob2.f2();
    cl3 ob3;
    ob3.f3();
    return 0;
}