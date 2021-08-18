#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream of("file",ios::in | ios::binary);
    if(!of)
    {
        cout<<"Cannot open file"<<endl;
    }
    else
    {
        char ch;
        while(of)
        {
            of.get(ch);  //reads a character from input file and stores it in ch variable
            if(of)
            cout<<ch;
        }
    }
    of.close();
    return 0;
}