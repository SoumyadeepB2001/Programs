#include <iostream>
using namespace std;
class cl
{
    int a;
    public:
    cl();
    cl(int);
    void display();
    cl operator++(int);         //to differentiate with prefix we have to use a dummy parameter int 
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

cl cl::operator++(int x)
{
    a++;
    return *this;
}

int main()
{
    cl ob1(5);
    ob1++;
    ob1.display();
    cl ob2(10), ob3;
    ob3 = ob2++;
    ob2.display();
    ob3.display();
    return 0;
}