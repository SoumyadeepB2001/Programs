#include <stdio.h>
#include<math.h>
int main() 
{
  int n,n1,r,s=0;
  printf("Enter a number\n");
  scanf("%d",&n);
  n1=n;
  while(n>0)
  {
      r=n%10;
      s=s+pow(r,3);
      n=n/10;
  }
   if(s==n1)
   printf("Armstrong Number");
   else
   printf("Not Armstrong Number");
    return 0;
}