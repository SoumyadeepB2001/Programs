#include <stdio.h>
#include<string.h>
#include <ctype.h>
void main () 
{
  float a1,a2,a3,a4,x;
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++){
       scanf("%f %f %f %f",&a1,&a2,&a3,&a4);
       x=100/(a1*a2*a3*a4);
       if(x<9.58)
          printf("YES\n");
        else
        printf("NO\n");  
  }
}