#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ofstream of;
    of.open("file1.txt", ios::out);
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