#include <iostream>
using namespace std;

class cl1
{
    public:
    cl1()
    {
        cout<<"cl1 Contructor"<<endl;
    }
    ~cl1()
    {
        cout<<"cl1 Destructor"<<endl;
    }
};

class cl2:public cl1
{
    public:
    cl2()
    {
        cout<<"cl2 Contructor"<<endl;
    }
    ~cl2()
    {
        cout<<"cl2 Destructor"<<endl;
    }
};

class cl3:public cl2
{
    public:
    cl3()
    {
        cout<<"cl3 Contructor"<<endl;
    }
    ~cl3()
    {
        cout<<"cl3 Destructor"<<endl;
    }
};

int main()
{
    cl3 ob3;
    cout<<"Main function"<<endl;
    return 0;
}