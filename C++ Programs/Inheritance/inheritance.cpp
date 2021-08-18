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

int main()
{
    cl2 ob2;
    cout<<"Main function"<<endl;
    return 0;
}