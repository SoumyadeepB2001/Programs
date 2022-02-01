#include <iostream>
#include <malloc.h>
using namespace std;

struct node
{
	int data;
	struct node* link;
};

int main()
{
	struct node * FIRST = NULL, *temp;
	FIRST = new node;
	FIRST -> data=3;
	FIRST -> link = NULL;
	
	temp = new node;
	temp -> data=5;
	temp -> link = NULL;
	FIRST -> link = temp;
	
	temp = new node;
	temp -> data=7;
	temp -> link = NULL;
	FIRST -> link -> link = temp;
	
	//printf("%d -> %d -> %d -> NULL \n",FIRST->data, FIRST->link->data, FIRST->link->link->data);
	cout<<FIRST->data<<" -> "<<FIRST->link->data<<" -> "<<FIRST->link->link->data<<endl;
	printf("%p \n",temp);
	printf("%p \n",FIRST->link->link);
	
}
