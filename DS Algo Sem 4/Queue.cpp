// Queue

#include <iostream>
using namespace std;
class cl
{
    int q[30], front, rear;

public:
    cl();
    void insert();
    void qdelete();
    void display();
    int returnFront();
    int returnRear();
};

cl::cl()
{
    front = -1;
    rear = -1;
}

int cl::returnFront()
{
    return front;
}

int cl::returnRear()
{
    return rear;
}

int main()
{
    cl ob;
    int ch;

    while (1)
    {
        printf("Enter 1 to insert \n");
        printf("Enter 2 to delete \n");
        printf("Enter 3 to display \n");
        printf("Enter 4 for exit \n");
        printf("Enter your choice \n");
        scanf("%d", &ch);

        int front, rear;
        front = ob.returnFront();
        rear = ob.returnRear();

        switch (ch)
        {
        case 1:
            if (rear == 29)
                printf("Queue overflow \n");
            else
            {
                ob.insert();
            }
            break;

        case 2:
            if (front == -1)
                printf("Queue Underflow \n");
            else
            {
                ob.qdelete();
            }
            break;
        case 3:
            if (front == -1)
                printf("Empty Queue\n");
            else
            {
                ob.display();
            }
            break;
        case 4:
            printf("End of the program \n");
            break;

        default:
            printf("Wrong Input \n");
            break;
        }

        if (ch == 4)
            break;
    }
}

void cl::insert()
{
    int v;
    printf("Enter a value for insertion \n");
    scanf("%d", &v);
    q[++rear] = v;
    if (front == -1)
        front = 0;
}

void cl::qdelete()
{
    int v = q[front];
    printf("Deleted value = %d \n", v);
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else
    {
        front++;
    }
}

void cl::display()
{
    int i;
    printf("Elements of the queue = \n");
    for (i = front; i <= rear; i++)
        printf("%d ", q[i]);
    printf("\n");
}
