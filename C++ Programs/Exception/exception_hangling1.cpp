#include <iostream>
using namespace std;

int main()
{
    cout<<"Starting of main function"<<endl;
    try
    {
        cout<<"Starting of try block"<<endl;
        throw 10;
        cout<<"End of try block"<<endl;
    }
    catch(int i)
    {
        cout<<"Inside catch block"<<endl;
    }
    cout<<"End of main function"<<endl;
    return 0;
}