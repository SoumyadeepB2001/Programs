#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

struct Node *getNode()
{

    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->next = NULL;
    return ptr;
}

struct Node *createList()
{
    struct Node *head = NULL, *currentNode;
    char choice;

    do
    {
        if (head == NULL)
        {

            head = getNode();
            currentNode = head;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        }
        else
        {
            currentNode->next = getNode();
            currentNode = currentNode->next;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        }

        printf("Add another value? (y/n): ");
        scanf("%c", &choice);
        scanf("%c", &choice);

    } while (choice == 'y');

    return head;
}

struct Node* sortList(struct Node *head)
{
    struct Node *p, *q;
    int data;
    for (p = head; p->next != NULL; p = p->next)
    {
        for (q = p->next; q != NULL; q = q->next)
        {
            if (p->data > q->data)
            {
                data = p->data;
                p->data = q->data;
                q->data = data;
            }
        }
    }
    return head;
}

struct Node* displayList(struct Node *head)
{

    struct Node *temp;
    temp = head;
    while (temp != NULL)
    {

        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL");
}

int main()
{
    struct Node *HEAD = NULL;
    HEAD = createList();
    printf("The entered values are:\n");
    displayList(HEAD);
    HEAD = sortList(HEAD);
    printf("\nThe sorted values are:\n");
    displayList(HEAD);
    return 0;
}