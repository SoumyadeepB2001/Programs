#include<stdio.h> 
void main()
{
    float c,f; 
    printf("\nEnter temperature in Fahrenheit: ");
    scanf("%f",&f);
    c=(f - 32)*5/9;
    printf("\nCelsius = %.3f",c); 
}