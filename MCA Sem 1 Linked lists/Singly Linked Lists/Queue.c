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

struct Node *createQueue()
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

struct Node *insert(struct Node *head)
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

        printf("Enqueue another element? (y/n): ");
        scanf("%c", &choice);
        scanf("%c", &choice);

    } while (choice == 'y');

    return head;
}

struct Node *delete(struct Node *head)
{
    char choice;

    do
    {
        if (head != NULL)
        {
            struct Node *oldHead;
            oldHead = head;
            head = head->next;
            printf("\nDequeued element = %d\n", oldHead->data);
            free(oldHead);
        }
        else
        {
            printf("The list is empty");
        }

        printf("Dequeue another element? (y/n): ");
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
    HEAD = createQueue();
    printf("\nThe entered values are:\n");
    displayList(HEAD);

    int choice = 0;
    printf("\nEnter 1 to enqueue or 2 to dequeue\n");
    scanf("%d", &choice);
    switch (choice)
    {
    case 1:
        HEAD = insert(HEAD);
        printf("\nThe list after enqueue:\n");
        displayList(HEAD);
        break;
    case 2:
        HEAD = delete (HEAD);
        printf("\nThe list after dequeue:\n");
        displayList(HEAD);
        break;
    default:
        printf("Wrong choice");
        break;
    }

    return 0;
}