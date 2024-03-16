#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
};

struct Node* getNode() {
    struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
    ptr->prev = NULL;
    ptr->next = NULL;
    return ptr;
}

struct Node* createList() {
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

struct Node* deleteFromBeginning(struct Node* head) {
    if (head != NULL) {
        struct Node* oldHead = head;
        head = head->next;
        if (head != NULL)
            head->prev = NULL;
        free(oldHead);
        return head;
    } else {
        printf("The list is empty");
        return head;
    }
}

struct Node* deleteFromPos(struct Node* head) {
    if (head == NULL) {
        printf("The list is empty");
        return head;
    } else {
        int pos;
        printf("Enter the position to be deleted: ");
        scanf("%d", &pos);

        if (pos < 1) {
            printf("Enter a valid position");
            return head;
        } else if (pos == 1) {
            return deleteFromBeginning(head);
        } else {
            pos = pos - 1;
            struct Node* currentNode = head;
            while (--pos && currentNode->next != NULL) {
                currentNode = currentNode->next;
            }

            if (pos == 0) {
                struct Node* temp = currentNode->next;
                if (temp->next != NULL)
                    temp->next->prev = currentNode;
                currentNode->next = temp->next;
                free(temp);
                return head;
            } else {
                printf("Position not found.\n");
                return head;
            }
        }
    }
}

struct Node* deleteFromEnd(struct Node* head) {
    if (head == NULL) {
        printf("The list is empty");
        return head;
    } else if (head->next == NULL) {
        free(head);
        head = NULL;
        return head;
    } else {
        struct Node* currentNode = head;
        while (currentNode->next->next != NULL) {
            currentNode = currentNode->next;
        }
        free(currentNode->next);
        currentNode->next = NULL;
        return head;
    }
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
    printf("\nEnter 1 to delete a node from the beginning of the list.\nEnter 2 to delete a node from a specified position in the list.\nEnter 3 to delete a node from the end of the list. \n");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            HEAD = deleteFromBeginning(HEAD);
            printf("The new list: \n");
            displayList(HEAD);
            break;

        case 2:
            HEAD = deleteFromPos(HEAD);
            printf("The new list: \n");
            displayList(HEAD);
            break;

        case 3:
            HEAD = deleteFromEnd(HEAD);
            printf("The new list: \n");
            displayList(HEAD);
            break;

        default:
            printf("Enter a valid number");
            break;
    }

    return 0;
}