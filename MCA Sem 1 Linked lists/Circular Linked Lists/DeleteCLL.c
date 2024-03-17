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

struct Node* deleteFromBeginning(struct Node* head) {
    if (head == NULL) {
        printf("The list is empty\n");
        return NULL;
    }

    if (head->next == head) {
        // Only one node in the list
        free(head);
        return NULL;
    }

    struct Node* lastNode = head;
    while (lastNode->next != head) {
        lastNode = lastNode->next;
    }

    lastNode->next = head->next;
    struct Node* temp = head;
    head = head->next;
    free(temp);
    return head;
}

struct Node* deleteFromPos(struct Node* head) {
    if (head == NULL) {
        printf("The list is empty\n");
        return NULL;
    }

    int pos;
    printf("Enter the position to be deleted: ");
    scanf("%d", &pos);

    if (pos < 1) {
        printf("Enter a valid position\n");
        return head;
    }

    if (pos == 1) {
        return deleteFromBeginning(head);
    }

    struct Node* currentNode = head;
    pos = pos - 1;
    while (--pos && currentNode->next != head) {
        currentNode = currentNode->next;
    }

    if (pos == 0) {
        struct Node* temp = currentNode->next;
        currentNode->next = currentNode->next->next;
        free(temp);
        return head;
    } else {
        printf("Position not found.\n");
        return head;
    }
}

struct Node* deleteFromEnd(struct Node* head) {
    if (head == NULL) {
        printf("The list is empty\n");
        return NULL;
    }

    if (head->next == head) {
        // Only one node in the list
        free(head);
        return NULL;
    }

    struct Node* currentNode = head;
    while (currentNode->next->next != head) {
        currentNode = currentNode->next;
    }

    struct Node* temp = currentNode->next;
    currentNode->next = head;
    free(temp);
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

    printf("The initial list is:\n");
    displayCircularList(HEAD);

    int choice;
    printf("\nEnter 1 to delete a node from the beginning of the list.\nEnter 2 to delete a node from a specified position in the list.\nEnter 3 to delete a node from the end of the list. \n");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            HEAD = deleteFromBeginning(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        case 2:
            HEAD = deleteFromPos(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        case 3:
            HEAD = deleteFromEnd(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        default:
            printf("Enter a valid number\n");
            break;
    }

    return 0;
}