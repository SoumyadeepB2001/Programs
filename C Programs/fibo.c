#include <stdio.h>
int main() 
{
 int i,a=0,b=1,c=1;
printf("The Fibonacci series in the given range:");
 printf("\n 1 ");
 while(c<=100)
 {
    printf("%d ",c);
    a=b;b=c;
	c=a+b;
 }
    return 0;
}