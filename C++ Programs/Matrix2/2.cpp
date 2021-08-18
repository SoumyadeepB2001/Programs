//String overloading

#include <iostream>
#include <string.h>
using namespace std;
class cl
{
    char s[30];
    public:
    cl(char a[])
    {
        strcpy(s,a);
    }
    void operator+(cl ob1)
    {
        strcat(s,ob1.s);
    }
    void display()
    {
        puts(s);
    }
};
int main()
{
    char a[]="Sun";
    char b[30];
    cout<<"Enter a string"<<endl;
    gets(b);
    cl ob2(a);
    cl ob3(b);
    ob2+ob3;
    ob2.display();
    return 0;
}