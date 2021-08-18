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
    cl2(int y) :cl1(y)
    {
        b=y;
        cout<<"Constructor of class cl2 "<<b<<endl;
    }
};

int main()
{
    cl2 ob2(3);
    return 0;
}