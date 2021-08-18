#include <stdio.h>
struct book{
	char name[10];
	float price;
	char author[10];
};
struct book one;
int main(){
  printf("Enter book name,price,author name : ");
  scanf("%s %f %s",&one.name,&one.price,&one.author);
  
  printf("\nBook name : %s",one.name);
  printf("\nBook price : %.2f",one.price);
  printf("\nBook author : %s",one.author);
  return 0;
}

