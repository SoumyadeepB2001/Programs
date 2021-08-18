#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    ofstream of("file5.txt");   //constructor
    if(!of)
    {
        cout<<"Cannot open the file"<<endl;
    }
    else
    {
        of<<"B. Sc. 1st Year";
        of<<"1st Semester"<<endl;
        of<<"Computer Science"<<endl;
        of.close();
    }
    return 0;
}