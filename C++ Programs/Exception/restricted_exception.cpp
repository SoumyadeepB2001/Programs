#include <iostream>
using namespace std;

void f(int x) throw(int, char)
{
    if(x==0)
    {
        throw 10;
    }
    else
    {
        throw 1.1;
    }
}

int main()
{
    try
    {
        f(5);
    }
    catch(int i)
    {
        cout<<"caught an integer variable"<<endl;
    }
    catch(char j)
    {
        cout<<"caught a character variable"<<endl;
    }
    return 0;
}