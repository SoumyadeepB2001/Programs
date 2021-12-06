//Queue

#include <stdio.h>
#define maxsize 4
int q[maxsize], front, rear;

void insert();
void delete();
void display();

int main()
{
	int ch;
	front = -1;
	rear = -1;
	
	while(1)
    {
    printf("Enter 1 to insert \n");
    printf("Enter 2 to delete \n");
    printf("Enter 3 to display \n");
    printf("Enter 4 for exit \n");
    printf("Enter your choice \n");
    scanf("%d", &ch);

    switch (ch)
    {
    case 1:
		if((rear+1)%maxsize == front)
			printf("Circular Queue overflow \n");
		else
		{
			insert();
		}
        break;

    case 2:
    	if(front == -1)
			printf("Queue underflow \n");
		else
		{
			delete();
		}
        break;
    case 3:
        if(front == -1)
			printf("Queue Empty \n");
		else
		{
			display();
		}
        break;
        case 4:
        	printf("End of the program \n");
        	break;

    default:
        printf("Wrong Input \n");
        break;
    }
    
    if(ch==4)
    	break;
    }
}

void insert()
{
	int v;
	printf("Enter a value for insertion \n");
	scanf("%d", &v);
	rear = (rear+1)%maxsize;
	q[rear] = v;
	if(front == -1)
		front = 0;
}

void delete()
{
	int v = q[front];
	printf("Deleted value = %d \n", v);
	if(front==rear)
	{
		front = -1;
		rear = -1;
	}
	else
	{
		front = (front+1)%maxsize;
	}
}

void display()
{
	int i;
	printf("Elements of the queue = \n");
	i = front;
	if(front<=rear)
	{
		while(i<=rear)
		{
			printf("%d ",q[i]);
			i++;
		}
		
	}
	else
	{
		while(i<=maxsize-1)
		{
			printf("%d ",q[i]);
			i++;
		}
		i = 0;
		while(i<=rear)
		{
			printf("%d ",q[i]);
			i++;
		}
			
	}
}

