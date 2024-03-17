#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* getNode() {
    struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
    ptr->next = NULL;
    return ptr;
}

struct Node* createCircularList() {
    struct Node* head = NULL, *currentNode, *lastNode = NULL;
    char choice;

    do {
        currentNode = getNode();
        printf("Enter a value: ");
        scanf("%d", &currentNode->data);

        if (head == NULL) {
            head = currentNode;
        } else {
            lastNode->next = currentNode;
        }

        lastNode = currentNode;

        printf("Add another value? (y/n): ");
        scanf(" %c", &choice);
    } while (choice == 'y');

    // Make the list circular by connecting the last node to the head
    lastNode->next = head;

    return head;
}

void displayCircularList(struct Node* head) {
    struct Node* temp = head;

    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    printf("Circular List: ");
    do {
        printf("%d -> ", temp->data);
        temp = temp->next;
    } while (temp != head);

    printf("%d\n", head->data); // Print the data of the head node to complete the circle
}

int main() {
    struct Node* HEAD = NULL;
    HEAD = createCircularList();
    printf("The entered values are:\n");
    displayCircularList(HEAD);
    return 0;
}