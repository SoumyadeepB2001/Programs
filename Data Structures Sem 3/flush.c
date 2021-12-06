#include <stdio.h>

int main()
{
    char a,b;
    
    printf("Enter 1 character: ");
    scanf("%c",&a);
    
    fflush(stdin);
    
    printf("Enter another character: ");
    scanf("%c",&b);
    
    printf("a = %c b= %c",a,b);
    
    return 0;
}