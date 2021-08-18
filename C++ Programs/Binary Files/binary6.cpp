#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream of("file1", ios::in | ios::binary);
    if (!of)
    {
        cout << "Can't open file" << endl;
    }
    else
    {
        char ch;
        int w = 0, s = 0;
        while (of)
        {
            of.get(ch); //read a character from input file and store it in ch variable
            if (of)
            {
                if(ch==' ')
                w++;
                if(ch=='.')
                s++;
            }
        }
        cout << "Number of words = " << w+1 << endl;
        cout << "Number of Sentences = " << s << endl;
    }
    of.close();
    return 0;
}