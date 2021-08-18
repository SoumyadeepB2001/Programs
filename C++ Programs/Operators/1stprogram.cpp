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
        cout<<a<<" "<<b<<endl;
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
        ob3.a = a * ob2.a;
        ob3.b = b * ob2.b;
        return ob3;
    }
    cl operator/ (cl ob2)
    {
        cl ob3;
        ob3.a = a / ob2.a;
        ob3.b = b / ob2.b;
        return ob3;
    }
};
int main()
{
    cl ob1(10,10), ob2(2,2), ob3, ob4, ob5, ob6;
    ob3 = ob1 + ob2;
    ob4 = ob1 - ob2;
    ob5 = ob1 * ob2;
    ob6 = ob1 / ob2;
    ob3.display();
    ob4.display();
    ob5.display();
    ob6.display();
    return 0;
}