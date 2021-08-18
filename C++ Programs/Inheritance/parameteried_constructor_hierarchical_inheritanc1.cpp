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

int main()
{
    cl2 ob2(9,11);
    cl3 ob3(3,5);
    return 0;
}