#include <iostream>
using namespace std;

class cl
{
    int a;
    public:
    cl()
    {       
    }
    cl(int x)
    {
        a=x;
    }
    void display()
    {
        cout<<"a = "<<a<<endl;
    }
    friend cl operator+ (cl ob1, cl ob2);
    friend cl operator- (cl ob1, cl ob2);
    friend cl operator* (cl ob1, cl ob2);
    friend cl operator/ (cl ob1, cl ob2);

};

cl operator+ (cl ob1, cl ob2)
{
    cl ob3;
    ob3.a = ob1.a + ob2.a;
    return ob3;
}

cl operator- (cl ob1, cl ob2)
{
    cl ob3;
    ob3.a = ob1.a - ob2.a;
    return ob3;
}

cl operator* (cl ob1, cl ob2)
{
    cl ob3;
    ob3.a = ob1.a * ob2.a;
    return ob3;
}

cl operator/ (cl ob1, cl ob2)
{
    cl ob3;
    ob3.a = ob1.a / ob2.a;
    return ob3;
}

int main()
{
    cl ob1(10), ob2(5), ob3, ob4, ob5, ob6;
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