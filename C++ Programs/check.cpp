/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
 
   for(int i=1;i<=6;i++)
   {
       cout<<"i="<<i<<endl;
       for(int j=1;j<=7;j++){
       if(j==5)
       break;
       else
       cout<<"j="<<j<<endl;
       }
   }

    return 0;
}
