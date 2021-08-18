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
    ifstream of("Student", ios::in | ios::binary);
    if(!of)
    {
        cout<<"Can't open file"<<endl;
    }
    else
    {
        of.read((char *)&s, sizeof(struct student));
        cout<<s.name<<" "<<s.marks<<endl;
    }
    of.close();
}