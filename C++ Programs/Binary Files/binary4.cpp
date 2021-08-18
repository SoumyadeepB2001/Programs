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
        int d=0,l=0,u=0,s=0;
        while(of)
        {
            of.get(ch);      //read a character from input file and store it in ch variable
            if(of)
            {
                if(ch>='0' && ch<='9')
                d++;
                if(ch>='a' && ch<='z')
                l++;
                if(ch>='A' && ch<='Z')
                u++;
                if(ch==' ')
                s++;
            }
        }
        cout<<"Number of lower case alphabets = "<<l<<endl;
        cout<<"Number of upper case alphabets = "<<u<<endl;
        cout<<"Number of digits = "<<d<<endl;
        cout<<"Number of blank space = "<<s<<endl;
    }
    of.close();
    return 0;
}