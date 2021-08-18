#include <iostream>
using namespace std;

class cl1
{
    public:
    int a,b;
};

class cl2:public cl1
{
    public:
    int c,d;
};

int main()
{
    cout<<"Size of class 1 "<<sizeof(cl1)<<endl;
    cout<<"Size of class 2 "<<sizeof(cl2)<<endl;
    return 0;
}