#include <iostream>
using namespace std;

class cl
{
    int a, b;
    public:
    void input();
    void output();
    void swap();
};

void cl::input()
{
    cout << "Enter two numbers" << endl;
    cin >> a >> b;
}
void cl::output()
{
    cout << a << "\t" << b << endl;
}
void cl::swap()
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}

int main()
{
    cl ob;
    ob.input();
    ob.output();
    ob.swap();
    ob.output();
    return 0;
}