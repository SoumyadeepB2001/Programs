/*
1. Take three variables, one for the matrix, one for the row and another for the column
2. Default constructor r=3, c=3
3. Parameterised constructor: User input
4. input() function
5. display() function
*/

#include <iostream>
using namespace std;
class cl
{
    public:
    int a[20][20], r,c;

    cl()
    {
        r=3,c=3;
    }

    cl(int a, int b)
    {
        r=a, c=b;
    }
    void input()
    {
        cout<<"Enter the elements of the array"<<endl;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            cin>>a[i][j];
        }
    }
    void display()
    {
        cout<<"The contents of the array are"<<endl;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            cout<<a[i][j]<<" ";
            cout<<endl;
        }
    }
};
int main()
{
    cl ob;
    ob.input();
    ob.display();
    int r,c;
    cout<<"Enter the number of rows and columns"<<endl;
    cin>>r>>c;
    cl ob1(r,c);
    ob1.input();
    ob1.display();
    return 0;
}