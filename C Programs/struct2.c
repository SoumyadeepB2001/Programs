#include <stdio.h>
struct book
{
    char bname[100];
    char aname[100];
    float price;
};

void main()
{
    struct book b[3];
    int i;
    printf("hello");
    for(i=0;i<=2;i++)
    {
        printf("Enter book name, author name and price \n");
        gets(b[i].bname);
        gets(b[i].aname);
        scanf("%f", &b[i].price);
    }
    for(i=0;i<=2;i++)
    {
    printf("Book name : %s \n",b[i].bname);
    printf("Book author : %s \n",b[i].aname);
    printf("Book price : %.2f \n",b[i].price);
    printf("\n");
    }
  
}