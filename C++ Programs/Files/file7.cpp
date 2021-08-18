#include <fstream>
#include <iostream>
using namespace std;

int main()
{
    int n, marks1, marks2;
    char name[30];
    ifstream f("student.txt");   //constructor
    if(!f)
    {
        cout<<"Cannot open the file"<<endl;
    }
    else
    {
        cout<<"Enter total number of students"<<endl;
        cin>>n;

        for(int i=1; i<=n; i++)
        {
            f>>name>>marks1>>marks2;
            cout<<name<<" "<<marks1<<" "<<marks2<<endl;
        }
        f.close();
    }
    return 0;
}