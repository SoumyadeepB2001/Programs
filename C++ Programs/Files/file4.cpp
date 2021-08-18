#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ofstream of("file4.txt");   //constructor
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