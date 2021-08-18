#include<stdio.h>
int main()
{
    float a,b;
    char c;
    printf("Enter two numbers\n");
    scanf("%f%f",&a,&b);
    printf("Enter the operation to perform\n");
    scanf(" %c",&c);
    switch(c)
    {
        case '+':
            printf("%0.2f",a+b);
            break;
         case '-':
            printf("%0.2f",a-b);
            break;
         case '*':
            printf("%0.2f",a*b);
            break;
         case '/':
            printf("%0.2f",a/b);
            break;
        default:
            printf("Wrong input");
            break;
    }
}