#include<stdio.h>
struct s
{
    int a,b,c,d;
    char g;
};
void main()
{
    struct s c1;
    printf("Enter Roll,Theory and prac");
    scanf("%d%d%d",&c1.a,&c1.b,&c1.c);
    c1.d=(c1.b+c1.c)/2;
    if(c1.d>=70)
    c1.g='A';
    else if(c1.d<70 && c1.d>=40)
    c1.g='B';
    else   
    c1.g='C';
    c1.d=c1.b+c1.c;
    printf("Roll=%d Total=%d Grade=%c",c1.a,c1.d,c1.g);
    
}