#include <iostream>
using namespace std;

class cl1
{
    protected:
    int a,b;
    public:
    virtual void input()=0;
    virtual void area()=0;
};

class rectangle: public cl1
{
    public:
    void input()
    {
        cout<<"Enter length and breadth"<<endl;
        cin>>a>>b;
    }
    void area()
    {
        double area = a*b;
        cout<<"Area of the Rectangle = "<<area<<endl;
    }
}; 

class triangle: public cl1
{
    public:
    void input()
    {
        cout<<"Enter base and height"<<endl;
        cin>>a>>b;
    }
    void area()
    {
        double area = 0.5*a*b;
        cout<<"Area of the Triangle = "<<area<<endl;
    }
}; 

int main()
{
    cl1 *p;
    rectangle ob1;
    p = &ob1;
    p->input();
    p->area();
    triangle ob2;
    p = &ob2;
    p->input();
    p->area();
    return 0;
}