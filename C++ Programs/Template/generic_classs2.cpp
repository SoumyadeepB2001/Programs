#include <iostream>
using namespace std;

template <class T>
class cl
{
    T a,b;
    public:
    void input()
    {
        cout<<"Enter two numbers"<<endl;
        cin>>a>>b;
    }
    void output()
    {
        cout<<a<<"\t"<<b<<endl;
    }
    void swap()
    {
        T temp;
        temp = a;
        a = b;
        b = temp;
    }
};

int main()
{
    cl <int> ob;
    cout<<"Integer values"<<endl;
    ob.input();
    ob.output();
    ob.swap();
    ob.output();
    cl <char> ob1;
    cout<<"Character values"<<endl;
    ob1.input();
    ob1.output();
    ob1.swap();
    ob1.output();
    cl <float> ob2;
    cout<<"Float values"<<endl;
    ob2.input();
    ob2.output();
    ob2.swap();
    ob2.output();
    
    
    return 0;
}