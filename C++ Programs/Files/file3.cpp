#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ofstream of;
    of.open("file3.txt");
    if(!of)
    {
        cout<<"Cannot open the file"<<endl;
    }
    else
    {
        of.close();
    }
    return 0;
}