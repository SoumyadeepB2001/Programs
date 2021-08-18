#include<stdio.h>
struct s
{
    int r,m;
};
void main()
{
    struct s s1,s2,s3;
    printf("Input Roll marks of 3");
    scanf("%d%d%d%d%d%d",&s1.r,&s1.m,&s2.r,&s2.m,&s3.r,&s3.m);
    if(s1.m>=s2.m && s1.m>=s3.m)
    printf("%d",s1.r);
    if(s2.m>=s1.m && s2.m>=s3.m)
    printf("%d",s2.r);
    if(s3.m>=s2.m && s3.m>=s1.m)
    printf("%d",s3.r);

}


