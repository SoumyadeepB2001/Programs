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

struct Node* reverseCircularList(struct Node* head) {
    if (head == NULL || head->next == head) {
        // Empty list or only one node
        return head;
    }

    struct Node* prevNode = head;
    struct Node* currNode = head->next;
    struct Node* nextNode;
    head->next = NULL;  // Break the circular link temporarily

    do {
        nextNode = currNode->next;
        currNode->next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
    } while (currNode != head);

    struct Node* newHead = prevNode;
    prevNode = currNode;  // prevNode now points to the original head

    // Restore the circular link
    prevNode->next = newHead;

    return newHead;
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

    printf("The reversed list is:\n");
    HEAD = reverseCircularList(HEAD);
    displayCircularList(HEAD);

    return 0;
}