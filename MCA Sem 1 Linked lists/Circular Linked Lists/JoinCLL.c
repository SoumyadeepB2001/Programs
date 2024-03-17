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

struct Node* joinCircularLists(struct Node* head1, struct Node* head2) {
    if (head1 == NULL) {
        return head2;
    }

    if (head2 == NULL) {
        return head1;
    }

    struct Node* lastNode1 = head1;
    while (lastNode1->next != head1) {
        lastNode1 = lastNode1->next;
    }

    struct Node* lastNode2 = head2;
    while (lastNode2->next != head2) {
        lastNode2 = lastNode2->next;
    }

    lastNode1->next = head2;
    lastNode2->next = head1;

    return head1;
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
    struct Node* HEAD1 = NULL;
    struct Node* HEAD2 = NULL;

    HEAD1 = createCircularList();
    printf("Enter values for the second list:\n");
    HEAD2 = createCircularList();

    printf("First list:\n");
    displayCircularList(HEAD1);

    printf("Second list:\n");
    displayCircularList(HEAD2);

    struct Node* JOINED_HEAD = joinCircularLists(HEAD1, HEAD2);

    printf("Joined list:\n");
    displayCircularList(JOINED_HEAD);

    return 0;
}