#include <iostream>
using namespace std;
class cl1
{
    protected:
    int a,b;
    public:
    void input()
    {
        cout<<"Enter two values"<<endl;
        cin>>a>>b;
    }
    virtual void f()=0;
};
class add: public cl1
{
    public:
    void f()
    {
        int sum = a+b;
        cout<<"Addition is = "<<sum<<endl;
    }
};
class sub: public cl1
{
    public:
    void f()
    {
        int diff = a - b;
        cout<<"Suntraction is "<<diff<<endl;
    }
};
int main()
{
    add ob1;
    ob1.input();
    ob1.f();
    sub ob2;
    ob2.input();
    ob2.f();
    return 0;
}