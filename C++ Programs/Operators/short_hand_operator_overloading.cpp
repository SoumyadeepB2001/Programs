#include <iostream>
using namespace std;
class cl
{
    int a,b;
    public:
    cl();
    cl(int, int);
    void display();
    cl operator+= (cl ob2);
};
cl::cl()
{       
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
cl cl::operator+=(cl ob2)
{
    this->a+= ob2.a;
    this->b+= ob2.b;
    return *this;
}
int main()
{
    cl ob1(10,10), ob2(2,2);
    ob1.display();
    ob2.display();
    ob1+=ob2;           //ob1=ob1+ob2
    cout<<"----------"<<endl;
    ob1.display();
    return 0;
}