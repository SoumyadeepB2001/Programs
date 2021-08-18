#include <iostream>
using namespace std;
class cl
{
    int a;
    public:
    cl();
    cl(int);
    void display();
    cl operator--();
};

cl::cl()
{
}

cl::cl(int x)
{
    a=x;
}

void cl::display()
{
    cout<<"a = "<<a<<endl;
}

cl cl::operator--()
{
    --a;
    return *this;
}

int main()
{
    cl ob1(5);
    --ob1;
    ob1.display();
    cl ob2(10), ob3;
    ob3 = --ob2;
    ob2.display();
    ob3.display();
    return 0;
}