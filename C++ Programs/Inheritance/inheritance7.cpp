#include <iostream>
using namespace std;

class cl1
{
    protected:
    int a,b;
    public:
    void input1(int x, int y)
    {
        a=x, b=y;
    }
};

class cl2:public cl1
{
    private:
    int c,d;
    public:
    void f()
    {
        cout<<a<<" "<<b<<" "<<c<<" "<<d<<endl;
    }
    void input2(int x, int y)
    {
        c=x, d=y;
    }
};

int main()
{
    cl2 ob2;
    ob2.input1(10,20);
    ob2.input2(30,40);
    ob2.f();
    return 0;
}