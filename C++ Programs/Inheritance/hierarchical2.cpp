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

class cl2:public cl1
{
    protected:
    int b;
    public:
    void f2()
    {
        a=5,b=6;
        cout<<"a = "<<a<<" b = "<<b<<endl;
    }
};

class cl3:public cl1
{
    protected:
    int c;
    public:
    void f3()
    {
        a=5,c=7;
        cout<<"a = "<<a<<" c = "<<c<<endl;
    }
};

class cl4:public cl1
{
    protected:
    int d;
    public:
    void f4()
    {
        a=5,d=8;
        cout<<"a = "<<a<<" d = "<<d<<endl;
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
    cl4 ob4;
    ob4.f4();
    return 0;
}