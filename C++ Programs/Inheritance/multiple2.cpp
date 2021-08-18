#include <iostream>
using namespace std;

class cl1
{
    int a;
};

class cl2
{
    int b;
};

class cl3
{
    int c;
};

class cl4:public cl1, public cl2, public cl3
{
    int d;
};

int main()
{
    cout<<"Size of Class Cl1 = "<<sizeof(cl1)<<endl;
    cout<<"Size of Class Cl2 = "<<sizeof(cl2)<<endl;
    cout<<"Size of Class Cl3 = "<<sizeof(cl3)<<endl;
    cout<<"Size of Class Cl4 = "<<sizeof(cl4)<<endl;
    return 0;
}