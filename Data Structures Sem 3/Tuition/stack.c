#include <stdio.h>
#define max 4

int s[20], top = -1;

int overflow()
{
	if(top==max-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int underflow()
{
	if(top==-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void push(int x)
{
	if(overflow())
	{
		printf("Stack Overflow \n");
	}
	else
	{
		top++;
		s[top]=x;
	}
}

void pop()
{
	if(underflow())
	{
		printf("Stack Underflow \n");
	}
	else
	{
		int x = s[top];
		printf("Popped out value is %d \n",x);
		top--;
	}
}

void display()
{
	int i;
	if(underflow())
	{	
		printf("No elements \n");
	}
	else
	{
		for(i=top; i>=0; i--)
			printf("%d ",s[i]);
		printf("\n");
	}
}

void peep()		//display top most element without incrementing top
{
	if(underflow())
	{
		printf("No elements \n");
	}
	else
	{
		printf("Topmost element is %d \n",s[top]);
	}
}

int main()
{
	int ch,v;
	while(1)
    {
    printf("Enter 1 to push \n");
    printf("Enter 2 to pop \n");
    printf("Enter 3 to display \n");
    printf("Enter 4 for peep \n");
    printf("Enter 5 for exit \n");
    printf("Enter your choice \n");
    scanf("%d", &ch);

    switch (ch)
    {
    	case 1:
    	printf("Enter a value for push operation \n");
    	scanf("%d", &v);
    	push(v);
        break;

    	case 2:
    	pop();
        break;
        
    	case 3:
    	display();
        break;
        
    	case 4:
    	peep();
        break;
        
        case 5:
        printf("Program terminated \n");
		break;
		
    	default:
        printf("Wrong Input \n");
        break;
    }
    
    if(ch==5)
    	break;
    }
    return 0;
}
