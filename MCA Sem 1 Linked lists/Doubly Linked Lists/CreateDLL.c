#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *next;
    struct Node *prev; // Added a new pointer for previous node
};

struct Node *getNode() {
    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->next = NULL;
    ptr->prev = NULL; // Initialize prev pointer to NULL
    return ptr;
}

struct Node *createList() {
    struct Node *head = NULL, *currentNode;
    char choice;

    do {
        if (head == NULL) {
            head = getNode();
            currentNode = head;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        } else {
            currentNode->next = getNode();
            currentNode->next->prev = currentNode; // Update prev pointer of the new node
            currentNode = currentNode->next;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        }

        printf("Add another value? (y/n): ");
        scanf(" %c", &choice); // Added a space before %c to consume newline character
    } while (choice == 'y');

    return head;
}

void displayList(struct Node *head) {
    struct Node *temp;
    temp = head;

    // Print the list in the forward direction
    printf("Forward direction: ");
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // Print the list in the backward direction
    printf("Backward direction: ");
    temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->prev;
    }
    printf("NULL\n");
}

int main() {
    struct Node *HEAD = NULL;
    HEAD = createList();
    printf("The entered values are:\n");
    displayList(HEAD);
    return 0;
}