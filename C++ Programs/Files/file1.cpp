#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ofstream of;
    of.open("file.txt", ios::out);
    of.close();
    return 0;
}