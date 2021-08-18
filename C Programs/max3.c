#include <stdio.h>
int main() {
  int n1,n2,n3;
  printf("Enter 3 numbers\n");
  scanf("%d %d %d",&n1,&n2,&n3);
    if(n1>=n2 && n1>=n3)
   printf("Maximum number = %d",n1);
    else if(n2>=n1 && n2>=n3)
   printf("Maximum number = %d",n2);
    else if(n3>=n1 && n3>=n2)
   printf("Maximum number = %d",n3);
    return 0;
}
