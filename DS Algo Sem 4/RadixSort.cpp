#include<iostream>
using namespace std;
class RadixSort
{
    public:
    int items[60],n,i;
    void radixSort();
    void input();
    void output();
};

void RadixSort:: radixSort()
{
    int bucket[10][8],buck[10];
    int i,j,k,l,num,div,big,pass;
    div=1;
    num=0;
    big=items[0];
    for(i=0;i<n;i++)
    {
        if(items[i]>big)
            big=items[i];
    }

    while(big>0)
    {
        num=num+1;
        big=big/10;
    }
    for(pass=0;pass<num;pass++)
    {
        for(k=0;k<10;k++)
        {
            buck[k]=0;
        }
        for(i=0;i<n;i++)
        {
            l=(items[i]/div)%10;
            bucket[l][buck[l]++]=items[i];
        }
        i=0;
        for(k=0;k<10;k++)
        {
            for(j=0;j<buck[k];j++)
            {
                items[i++]=bucket[k][j];
            }
        }
        div=div*10;
    }
}

void RadixSort::input()
{
    cout<<"Enter the number of elements"<<endl;
    cin>>n;
    cout<<"Enter "<<n<<" elements"<<endl;
    for(int i=0;i<n;i++)
        cin>>items[i];

}

void RadixSort::output()
{
    cout<<"Sorted Array:"<<endl;
    for(int i=0;i<n;i++)
        cout<<items[i]<<" "<<endl;
}


int main()
{
    RadixSort ob;
    ob.input();
    ob.radixSort();
    ob.output();
}