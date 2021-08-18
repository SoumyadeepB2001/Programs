#include <iostream>
using namespace std;

class cl1
{
    protected:
    int a=1,b=2;
};

class cl2:public cl1
{
    private:
    int c=3,d=4;
    public:
    void f()
    {
        cout<<a<<" "<<b<<" "<<c<<" "<<d<<endl;
    }
};

int main()
{
    cl2 ob2;
    ob2.f();
    return 0;
}