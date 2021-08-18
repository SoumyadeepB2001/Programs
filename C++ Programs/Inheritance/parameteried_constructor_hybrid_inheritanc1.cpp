#include <iostream>
using namespace std;

class cl1
{
    int a;
    public:
    cl1(int x)
    {
        a=x;
        cout<<"Constructor of class cl1 "<<a<<endl;
    }
};

class cl2: public cl1
{
    int b;
    public:
    cl2(int x, int y) :cl1(x)
    {
        b=y;
        cout<<"Constructor of class cl2 "<<b<<endl;
    }
};

class cl3: public cl1
{
    int c;
    public:
    cl3(int x, int z) :cl1(x)
    {
        c=z;
        cout<<"Constructor of class cl3 "<<c<<endl;
    }
};

class cl4: public cl2, public cl3
{
    int d;
    public:
    cl4(int v, int w, int x, int y, int z): cl2(v,w), cl3(x,y)
    {
        d=z;
        cout<<"Constructor of class cl4 "<<d<<endl;
    }
};

int main()
{
    cl4 ob4(1,3,5,7,9);
    return 0;
}