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
       float value = (int)(x * 100 + .5);
       value=(float)value/100;
       if(value<9.58)
          printf("YES");
        else
        printf("NO");  
  }
}