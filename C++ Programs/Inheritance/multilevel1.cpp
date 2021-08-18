#include <iostream>
using namespace std;

class cl1
{
    int a;
};

class cl2:public cl1
{
    int b;
};

class cl3:public cl2
{
    int c;
};

int main()
{
    cout<<"Size of Class Cl1 = "<<sizeof(cl1)<<endl;
    cout<<"Size of Class Cl2 = "<<sizeof(cl2)<<endl;
    cout<<"Size of Class Cl3 = "<<sizeof(cl3)<<endl;
    return 0;
}