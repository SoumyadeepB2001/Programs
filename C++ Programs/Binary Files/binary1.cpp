#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ofstream of("file",ios::out | ios::binary);
    if(!of)
    {
        cout<<"Can't open file"<<endl;
    }
    else
    {
        of.put('a');
        of.put('b');
        of.put('c');
        of.put('d');
        of.put('e');
        of.put('f');
    }
    of.close();
    return 0;
}