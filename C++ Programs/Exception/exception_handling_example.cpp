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
    catch(int i)
    {
        cout<<"caught an integer variable"<<endl;
    }
    catch(double k)
    {
        cout<<"caugth a double variable"<<endl;
    }
    catch(char j)
    {
        cout<<"caught a character variable"<<endl;
    }
}

int main()
{
    cout<<"Starting of main function"<<endl;
    try
    {
        f(5);
    }
    catch(int i)
    {
        cout<<"caugth integer exception from main function"<<endl;
    }
    cout<<"End of main function"<<endl;
    return 0;
}