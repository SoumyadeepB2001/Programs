#include <iostream>
using namespace std;

class cl
{
    int a,b;
    public:
    cl()
    {       
    }
    cl(int x, int y)
    {
        a=x, b=y;
    }
    void display()
    {
        if(b>=0)
        cout<<a<<" + "<<b<<"i"<<endl;
        else
        {
            cout<<a<<"  "<<b<<"i"<<endl;
        }
        
    }
    
    cl operator- (cl ob2)
    {
        cl ob3;
        ob3.a = a - ob2.a;
        ob3.b = b - ob2.b;
        return ob3;
    }
};

int main()
{
    cl ob1(10,10), ob2(2,2), ob3;
    ob3=ob2-ob1;
    ob2.display();
    ob1.display();
    cout<<"----------"<<endl;
    ob3.display();
    
    return 0;
}