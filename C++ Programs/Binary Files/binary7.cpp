#include <iostream>
#include <fstream>
using namespace std;
struct student
{
    char name[20];
    int marks;
};
int main()
{
    struct student s;
    cout<<"Enter name of the student"<<endl;
    cin>>s.name;
    cout<<"Enter marks of the student"<<endl;
    cin>>s.marks;
    ofstream of ("Student", ios::out | ios::binary);
    if(!of)
    {
        cout<<"Can't open file"<<endl;
    }
    else
    {
        of.write((char *)&s, sizeof(struct student));
    }
    of.close();
}