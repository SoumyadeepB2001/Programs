#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream of("file", ios::in | ios::binary);
    if (!of)
    {
        cout << "Cannot open file" << endl;
    }
    else
    {
        char ch;
        int d=0,v=0,c=0;
        while (of)
        {
            of.get(ch); //read a character from input file and store it in ch variable
            if (of)
            {
                if (ch >= '0' && ch <= '9')
                    d++;
                if (ch >= 'a' && ch <= 'z')
                {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        v++;
                    else
                        c++;
                }
                if (ch >= 'A' && ch <= 'Z')
                {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        v++;
                    else
                        c++;
                }
            }
        }
        cout << "Number of vowels = " << v << endl;
        cout << "Number of consonants = " << c << endl;
        cout << "Number of digits = " << d << endl;
    }
    of.close();
    return 0;
}