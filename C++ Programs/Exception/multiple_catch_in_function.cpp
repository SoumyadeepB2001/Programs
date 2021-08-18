#include <iostream>
using namespace std;

void f(int x)
{
    try
    {
        if(x==0)
        {
            throw 10;
        }
        else
        {
            throw 'a';
        }
    }
    catch(int i)
    {
        cout<<"caught an integer variable"<<endl;
    }
    catch(char j)
    {
        cout<<"caught a character variable"<<endl;
    }
}

int main()
{
    cout<<"Starting of main function"<<endl;
    f(0);
    f(5);
    cout<<"End of main function"<<endl;
    return 0;
}