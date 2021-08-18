#include <iostream>
using namespace std;
class cl
{
    int a,b;
    public:
    cl();
    cl(int, int);
    void display();
    cl operator= (cl);
};

cl::cl()
{
    a=0, b=0;       
}

cl::cl(int x, int y)
{
    a=x, b=y;
}

void cl::display()
{
    if(b>=0)
    cout<<a<<" + "<<b<<"i"<<endl;
    else
    {
        cout<<a<<"  "<<b<<"i"<<endl;
    }
        
}

cl cl::operator=(cl ob2)
{
    a = ob2.a;
    b = ob2.b;
    return *this;
}

int main()
{
    cl ob1(10,10),ob2;
    cout<<"Before assignment operator overloading"<<endl;
    ob1.display();
    ob2.display();
    ob2 = ob1;
    cout<<"After assignment operator overloading"<<endl;
    ob1.display();
    ob2.display();
    cl ob3, ob4, ob5;
    ob3 = ob4 = ob5 = ob2;
    cout<<"Multiple assignments"<<endl;
    ob3.display();
    ob4.display();
    ob5.display();
    return 0;
}