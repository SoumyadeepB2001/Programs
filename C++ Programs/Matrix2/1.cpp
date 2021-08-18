//matrix operation using operator overloading
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
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            cout<<a[i][j]<<" ";
            cout<<endl;
        }
    }
    void operator+(cl ob1)
    {
        cl ob3;
        if(r==ob1.r && c==ob1.c)
        {
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    ob3.a[i][j]=a[i][j]+ob1.a[i][j];
                }
            }
            ob3.display();
        }
        else
        {
            cout<<"Wrong Input"<<endl;
        }
    }
    void operator-(cl ob1)
    {
        cl ob3;
        if(r==ob1.r && c==ob1.c)
        {
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    ob3.a[i][j]=a[i][j]-ob1.a[i][j];
                }
            }
            ob3.display();
        }
        else
        {
            cout<<"Wrong Input"<<endl;
        }
    }
    void operator*(cl ob1)
    {
        cl ob3;
        if(c==ob1.r)
        {
            ob3.r=r;
            ob3.c=ob1.c;
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<ob1.c; j++)
                {
                    ob3.a[i][j]=0;
                    for(int k=0; k<c; k++)
                    {
                        ob3.a[i][j]+=(a[i][k]*ob1.a[k][j]);
                    }
                }
            }
            ob3.display();
        }
        else
        {
            cout<<"Wrong Input"<<endl;
        }
    }
};
int main()
{
    int r,c;
    cout<<"Enter the number of rows and columns of 1st matrix"<<endl;
    cin>>r>>c;
    cl ob1(r,c);
    ob1.input();
    cout<<"Enter the number of rows and columns of 2nd matrix"<<endl;
    cin>>r>>c;
    cl ob2(r,c);
    ob2.input();
    cout<<"Addition"<<endl;
    ob1+ob2;
    cout<<"Subtraction"<<endl;
    ob1-ob2;
    cout<<"Multiplication"<<endl;
    ob1*ob2;
    return 0;
}