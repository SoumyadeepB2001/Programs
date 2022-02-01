#include <stdio.h>
#include <malloc.h>
struct node
{
	int data;
	struct node* link;
};

int main()
{
	struct node * FIRST = NULL, *temp;
	FIRST = (struct node*) malloc (sizeof(struct node));
	FIRST -> data=3;
	FIRST -> link = NULL;
	
	temp = (struct node*) malloc (sizeof(struct node));
	temp -> data=5;
	temp -> link = NULL;
	FIRST -> link = temp;
	
	temp = (struct node*) malloc (sizeof(struct node));
	temp -> data=7;
	temp -> link = NULL;
	FIRST -> link -> link = temp;
	
	printf("%d -> %d -> %d -> NULL \n",FIRST->data, FIRST->link->data, FIRST->link->link->data);
	printf("%p \n",temp);
	printf("%p \n",FIRST->link->link);
	
}
