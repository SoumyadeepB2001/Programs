#include <iostream>
using namespace std;
class cl
{
    private:
    int a[20][20], r,c;
    public:
    cl()
    {
        r=3,c=3;
    }

    cl(int x, int y)
    {
        r=y, c=x;
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
    friend void add(cl, cl);
};
void add(cl ob1, cl ob2)
{
    if(ob1.r==ob2.r && ob1.c==ob2.c)
    {
        for(int i=0; i<ob1.r; i++)
        {
            for(int j=0; j<ob1.c; j++)
            cout<<(ob1.a[i][j]+ob2.a[i][j])<<" ";
            cout<<endl;
        }
    }
    else
    {
        cout<<"Wrong Input"<<endl;
    }
}
int main()
{
    int r,c;
    cout<<"Enter the number of rows and columns of the 1st matrix"<<endl;
    cin>>r>>c;
    cl ob1(r,c);
    ob1.input();
    cout<<"Enter the number of rows and columns of the 2nd matrix"<<endl;
    cin>>r>>c;
    cl ob2(r,c);
    ob2.input();
    ob1.display();
    ob2.display();
    add(ob1, ob2);
    return 0;
}