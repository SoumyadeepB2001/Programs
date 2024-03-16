#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

struct Node* getNode() {
    struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
    ptr->prev = NULL;
    ptr->next = NULL;
    return ptr;
}

struct Node* createList() {
    struct Node* head = NULL, * currentNode;
    char choice;

    do {
        if (head == NULL) {
            head = getNode();
            currentNode = head;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        }
        else {
            currentNode->next = getNode();
            currentNode->next->prev = currentNode;
            currentNode = currentNode->next;
            printf("Enter a value: ");
            scanf("%d", &currentNode->data);
        }

        printf("Add another value? (y/n): ");
        scanf(" %c", &choice);
    } while (choice == 'y');

    return head;
}

struct Node* insertAtBeginning(struct Node* head) {
    struct Node* new = getNode();
    int data;
    printf("Enter data: ");
    scanf("%d", &data);

    if (head != NULL) {
        new->data = data;
        new->next = head;
        head->prev = new;
        head = new;
    }
    else {
        new->data = data;
        head = new;
    }

    return head;
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
        while (--pos && temp->next != NULL) {
            temp = temp->next;
        }

        if (pos == 0) {
            struct Node* new = getNode();
            int data;
            printf("Enter data: ");
            scanf("%d", &data);
            new->data = data;
            new->next = temp->next;
            if (temp->next != NULL)
                temp->next->prev = new;
            new->prev = temp;
            temp->next = new;
            return head;
        }
        else {
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

    if (head != NULL) {
        struct Node* temp = head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        new->data = data;
        temp->next = new;
        new->prev = temp;
    }
    else {
        new->data = data;
        head = new;
    }

    return head;
}

void displayList(struct Node* head) {
    struct Node* temp;
    temp = head;
    printf("NULL <-> ");
    while (temp != NULL) {
        printf("%d <-> ", temp->data);
        temp = temp->next;
    }
    printf("NULL");
}

int main() {
    struct Node* HEAD = NULL;
    HEAD = createList();
    printf("The entered values are:\n");
    displayList(HEAD);

    int choice;
    printf("\nEnter 1 to insert a node at the beginning of the list.\nEnter 2 to insert a node at a specified position in the list.\nEnter 3 to insert a node at the end of the list. \n");
    scanf("%d", &choice);

    switch (choice) {
    case 1:
        HEAD = insertAtBeginning(HEAD);
        printf("The new list: \n");
        displayList(HEAD);
        break;

    case 2:
        HEAD = insertAtPos(HEAD);
        printf("The new list: \n");
        displayList(HEAD);
        break;

    case 3:
        HEAD = insertAtEnd(HEAD);
        printf("The new list: \n");
        displayList(HEAD);
        break;

    default:
        printf("Enter a valid number");
        break;
    }

    return 0;
}