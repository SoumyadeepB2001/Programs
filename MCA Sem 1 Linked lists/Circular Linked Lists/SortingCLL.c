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
struct Node* sortList(struct Node *head) {
     struct Node *p, *q;
    int data;
    for (p = head; p->next != head; p = p->next)
    {
        for (q = p->next; q != head; q = q->next)
        {
            if (p->data > q->data)
            {
                data = p->data;
                p->data = q->data;
                q->data = data;
            }
        }
    }
    return head;
}
/*struct Node* sortList(struct Node *head) {
    if (head == NULL || head->next == head) {
        // Empty list or single node list, no need to sort
        return head;
    }

    int swapped;
    struct Node *curr = head;
    struct Node *last = NULL;

    // Get the last node of the circular linked list
    do {
        last = curr;
        curr = curr->next;
    } while (curr != head);

    // Break the circle
    last->next = NULL;

    // Bubble Sort
    do {
        swapped = 0;
        curr = head;

        while (curr->next != NULL) {
            struct Node *next = curr->next;

            if (curr->data > next->data) {
                // Swap the nodes
                int temp = curr->data;
                curr->data = next->data;
                next->data = temp;
                swapped = 1;
            }

            curr = next;
        }
    } while (swapped);

    // Restore the circular linked list
    curr = head;
    while (curr->next != NULL) {
        curr = curr->next;
    }
    curr->next = head;

    return head;
}*/

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
    HEAD = sortList(HEAD);
    printf("\nThe sorted values are:\n");
    displayCircularList(HEAD);
    return 0;
}
