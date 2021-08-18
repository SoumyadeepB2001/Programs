#include <iostream>
using namespace std;

class cl1
{
    public:
    int a,b;
};

class cl2:public cl1
{
    public:
    int c,d;
};

int main()
{
    cl1 ob1;
    ob1.a=3;
    ob1.b=4;
    cout<<ob1.a+ob1.b<<endl;
    cl2 ob2;
    ob2.a=10;
    ob2.b=20;
    ob2.c=30;
    ob2.d=40;
    cout<<ob2.a+ob2.b+ob2.c+ob2.d<<endl;
    return 0;
}