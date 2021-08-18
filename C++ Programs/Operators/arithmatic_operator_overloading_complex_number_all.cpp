#include <iostream>
#include <math.h>
using namespace std;
class cl
{
    double a,b;
    public:
    cl()
    {       
    }
    cl(double x, double y)
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
    
    cl operator+ (cl ob2)
    {
        cl ob3;
        ob3.a = a + ob2.a;
        ob3.b = b + ob2.b;
        return ob3;
    }
    cl operator- (cl ob2)
    {
        cl ob3;
        ob3.a = a - ob2.a;
        ob3.b = b - ob2.b;
        return ob3;
    }
    cl operator* (cl ob2)
    {
        cl ob3;
        ob3.a = (a*ob2.a) - (b*ob2.b);
        ob3.b = (a*ob2.b) + (b*ob2.a);
        return ob3;
    }
    cl operator/ (cl ob2)
    {
        cl ob3;
        ob3.a = ((a * ob2.a) + (b * ob2.b)) / (pow(ob2.a,2) + pow(ob2.b,2));
        ob3.b = ((ob2.a * b) - (a * ob2.b)) / (pow(ob2.a,2) + pow(ob2.b,2));
        return ob3;
    }
};
int main()
{
    cl ob1(10,10), ob2(2,2), ob3, ob4, ob5, ob6;
    cout<<"ADDITION"<<endl;
    ob3=ob2+ob1;   
    ob2.display();
    ob1.display();  
    cout<<"----------"<<endl;
    ob3.display();
    cout<<"SUBTRACTION"<<endl;
    ob4=ob2-ob1;
    ob2.display();
    ob1.display();
    cout<<"----------"<<endl;
    ob4.display();
    cout<<"MULTIPLICATION"<<endl;
    ob5=ob2*ob1;
    ob2.display();
    ob1.display();
    cout<<"----------"<<endl;
    ob5.display();
    cout<<"DIVISION"<<endl;
    ob6=ob2/ob1;
    ob2.display();
    ob1.display();
    cout<<"----------"<<endl;
    ob6.display();
    return 0;
}