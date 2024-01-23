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

struct Node *join(struct Node *head1, struct Node *head2)
{
    struct Node *currentNode = head1;

    while (currentNode->next != NULL)
    {
        currentNode = currentNode->next;
    }

    currentNode->next = head2;

    return head1;
}

void displayList(struct Node *head)
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

    struct Node *HEAD1 = NULL, *HEAD2 = NULL, *HEAD3 = NULL;
    printf("Enter values of the first Linked List:\n");
    HEAD1 = createList();

    printf("Enter values of the second Linked List:\n");
    HEAD2 = createList();

    printf("The entered values of first Linked List are:\n");
    displayList(HEAD1);

    printf("\nThe entered values of second Linked List are:\n");
    displayList(HEAD2);

    HEAD3 = join(HEAD1, HEAD2);
    printf("\nThe 2 lists after joining:\n");
    displayList(HEAD3);

    return 0;
}