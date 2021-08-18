#include <stdio.h>
int main() {
  int n,n1,s=0,r;
  printf("Enter a number\n");
  scanf("%d",&n);
  n1=n;
  while(n>0)
  {
      r=n%10;
      s=s*10+r;
      n=n/10;
  }
  if(s==n1)
  printf("It is a palindrome number");
  else
  printf("Not a palindrome number");
    return 0;
}