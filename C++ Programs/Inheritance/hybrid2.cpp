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

class cl4:public cl2, public cl3
{
    protected:
    int d;
    public:
    void f4()
    {
        cl2::a=5,cl3::a=9,b=6,c=7,d=8;
        cout<<"cl2 a = "<<cl2::a<<" cl3 a = "<<cl3::a<<" b = "<<b<<" c = "<<c<<" d = "<<d<<endl;
    }
};

int main()
{
    cl4 ob4;
    ob4.f4();
    return 0;
}