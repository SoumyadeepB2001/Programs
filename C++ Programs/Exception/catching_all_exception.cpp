#include <iostream>
using namespace std;

void f(int x)
{
    try
    {
        if(x>0)
        {
            throw 10;
        }
        if(x==0)
        {
            throw 1.1;
        }
        if(x<0)
        {
            throw 'a';
        }
    }
    catch(...)
    {
        cout<<"Caught all variable"<<endl;
    }
}

int main()
{
    cout<<"Starting of main function"<<endl;
    f(1);
    f(0);
    f(-1);
    cout<<"End of main function"<<endl;
    return 0;
}