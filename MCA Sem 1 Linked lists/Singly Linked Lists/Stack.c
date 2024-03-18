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

struct Node *createStack()
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

struct Node *push(struct Node *head)
{
    char choice;
    do
    {
        struct Node *new = getNode();
        int data;
        printf("Enter data: ");
        scanf("%d", &data);

        if (head != NULL)
        {
            struct Node *temp = head;

            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            new->data = data;
            temp->next = new;
        }
        else
        {
            new->data = data;
            head = new;
        }

        printf("Push another element? (y/n): ");
        scanf("%c", &choice);
        scanf("%c", &choice);

    } while (choice == 'y');

    return head;
}

struct Node *pop(struct Node *head)
{
    char choice;

    do
    {
        struct Node *currentNode;
        currentNode = head;

        if (head == NULL)
        {
            printf("The list is empty");
        }

        else if (head->next == NULL)
        {
            printf("\nPopped element = %d\n", head->data);
            free(head);
            head = NULL;
        }

        else
        {
            while (1)
            {
                if (currentNode->next->next == NULL)
                {
                    printf("\nPopped element = %d\n", currentNode->next->data);
                    free(currentNode->next);
                    currentNode->next = NULL;
                    break;
                }

                else
                {
                    currentNode = currentNode->next;
                }
            }
        }
        printf("Pop another element? (y/n): ");
        scanf("%c", &choice);
        scanf("%c", &choice);

    } while (choice == 'y');

    return head;
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

    struct Node *HEAD = NULL;
    HEAD = createStack();
    printf("\nThe entered values are:\n");
    displayList(HEAD);

    int choice = 0;
    printf("\nEnter 1 to push or 2 to pop\n");
    scanf("%d", &choice);
    switch (choice)
    {
    case 1:
        HEAD = push(HEAD);
        printf("\nThe list after push:\n");
        displayList(HEAD);
        break;
    case 2:
        HEAD = pop(HEAD);
        printf("\nThe list after pop:\n");
        displayList(HEAD);
        break;
    default:
        printf("Wrong choice");
        break;
    }

    return 0;
}