#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    int n, marks1, marks2;
    char name[30];
    ofstream of("student.txt");   //constructor
    if(!of)
    {
        cout<<"Cannot open the file"<<endl;
    }
    else
    {
        cout<<"Enter total number of students"<<endl;
        cin>>n;

        for(int i=1; i<=n; i++)
        {
            cout<<"Enter name, marks 1 and marks 2"<<endl;
            cin>>name>>marks1>>marks2;
            of<<name<<" "<<marks1<<" "<<marks2<<endl;
        }
        of.close();
    }
    return 0;
}