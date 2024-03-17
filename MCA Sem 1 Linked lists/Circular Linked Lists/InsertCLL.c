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

struct Node* insertAtBeginning(struct Node* head) {
    struct Node* new = getNode();
    int data;
    printf("Enter data: ");
    scanf("%d", &data);

    if (head == NULL) {
        new->data = data;
        new->next = new; // For circular linked list
        return new;
    }

    struct Node* lastNode = head;
    while (lastNode->next != head) {
        lastNode = lastNode->next;
    }

    new->data = data;
    new->next = head;
    lastNode->next = new;
    return new;
}

struct Node* insertAtPos(struct Node* head) {
    int pos;
    printf("Enter position: ");
    scanf("%d", &pos);

    if (pos <= 0) {
        printf("Enter a valid position.\n");
        return head;
    }

    if (pos == 1) {
        return insertAtBeginning(head);
    }

    if (head != NULL) {
        struct Node* temp = head;
        pos = pos - 1;
        while (--pos && temp->next != head) {
            temp = temp->next;
        }

        if (pos == 0) {
            struct Node* new = getNode();
            int data;
            printf("Enter data: ");
            scanf("%d", &data);
            new->data = data;
            new->next = temp->next;
            temp->next = new;
            return head;
        } else {
            printf("Position not found.\n");
            return head;
        }
    }
}

struct Node* insertAtEnd(struct Node* head) {
    struct Node* new = getNode();
    int data;
    printf("Enter data: ");
    scanf("%d", &data);

    if (head == NULL) {
        new->data = data;
        new->next = new; // For circular linked list
        return new;
    }

    struct Node* lastNode = head;
    while (lastNode->next != head) {
        lastNode = lastNode->next;
    }

    new->data = data;
    new->next = head;
    lastNode->next = new;
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
    printf("\nEnter 1 to insert a node at the beginning of the list.\nEnter 2 to insert a node at a specified position in the list.\nEnter 3 to insert a node at the end of the list. \n");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            HEAD = insertAtBeginning(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        case 2:
            HEAD = insertAtPos(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        case 3:
            HEAD = insertAtEnd(HEAD);
            printf("The new list: \n");
            displayCircularList(HEAD);
            break;
        default:
            printf("Enter a valid number");
            break;
    }

    return 0;
}