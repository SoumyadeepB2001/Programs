#include <stdio.h>
float square(float);
void main()
{
    float a,b;
    printf("Enter a number\n");
    scanf("%f", &a);
    b=square(a);
     printf("The square of %.2f is %.2f",a,b);
}
float square(float x)
{
    float y;
    y=x*x;
    return y;
}