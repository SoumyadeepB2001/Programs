#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream of("file",ios::in| ios::binary);
    if(!of)
    {
        cout<<"Can't open file"<<endl;
    }
    else
    {
        char ch;
        int d=0,a=0;
        while(of)
        {
            of.get(ch);   //read a character from input file and store it in ch variable
            if(of)
            {
                if(ch>='0' && ch<='9')
                d++;
                if(ch>='a' && ch<='z')
                a++;
                if(ch>='A' && ch<='Z')
                a++;
            }
        }
        cout<<"Number of alphabets = "<<a<<endl;
        cout<<"Number of digits = "<<d<<endl;
    }
    of.close();
    return 0;
}