#include <iostream>
using namespace std;
#define max 4

class cl
{
    int top, s[10], n;

public:
    cl();
    void push(int x);
    void pop();
    void display();
    int returntop();
};

cl::cl()
{
    top = -1;
}

void cl::push(int x)
{
    top++;
    s[top] = x;
}

void cl::pop()
{
    int x = s[top];
    printf("Popped out value is %d \n", x);
    top--;
}

void cl::display()
{
    int i;
    for (i = top; i >= 0; i--)
        printf("%d ", s[i]);
    printf("\n");
}

int cl::returntop()
{
    return top;
}

int main()
{
    cl ob;
    int ch, v;
    while (1)
    {
        printf("Enter 1 to push \n");
        printf("Enter 2 to pop \n");
        printf("Enter 3 to display \n");
        printf("Enter 4 to terminate \n");

        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Enter a value for push operation \n");
            scanf("%d", &v);
            ob.push(v);
            break;

        case 2:
            ob.pop();
            break;

        case 3:
            ob.display();
            break;

        case 4:
            printf("Program Terminated \n");
            break;

        default:
            printf("Wrong Input \n");
            break;
        }

        if (ch == 4)
            break;
    }
    return 0;
}
