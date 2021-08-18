#include <iostream>
using namespace std;
template <class T>
class cl
{
    T a[5], sum=0, avg;
    int length;
    public:
    void length_in()
    {
        cout<<"Enter the length"<<endl;
        cin>>length;
    }
    void array()
    {
        for (int i=0; i<length; i++)
        cin>>a[i];
    }
    void output()
    {
        for (int i=0; i<length; i++)
        sum=sum+a[i];
        avg=(double)sum/length;
        cout<<"sum = "<<sum<<endl<<"average = "<<avg<<endl;
    }
};
int main()
{
    cl <int> ob;
    ob.length_in();
    cout<<"Enter the content of array"<<endl;
    ob.array();
    ob.output();
    cl <float> ob1;
    ob1.length_in();
    cout<<"Enter the content of array"<<endl;
    ob1.array();
    ob1.output();
    return 0;
}