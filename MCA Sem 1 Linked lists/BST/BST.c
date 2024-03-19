#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* getNode(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

struct Node* insertNode(struct Node* root, int value) {
    if (root == NULL) {
        return getNode(value);
    }

    if (value < root->data) {
        root->left = insertNode(root->left, value);
    } else if (value > root->data) {
        root->right = insertNode(root->right, value);
    }

    return root;
}

void inorderTraversal(struct Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

void preorderTraversal(struct Node* root) {
    if (root != NULL) {
        printf("%d ", root->data);
        inorderTraversal(root->left);        
        inorderTraversal(root->right);
    }
}

void postorderTraversal(struct Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);
        inorderTraversal(root->right);
        printf("%d ", root->data);
    }
}

int main() {
    struct Node* root = NULL;
    int value, choice;

    do {
        printf("Enter a value to insert (-1 to exit): ");
        scanf("%d", &value);

        if (value != -1) {
            root = insertNode(root, value);
        }
    } while (value != -1);

    printf("Binary Search Tree Preorder: ");
    preorderTraversal(root);
    printf("\n");

    printf("Binary Search Tree Inorder: ");
    inorderTraversal(root);
    printf("\n");

    printf("Binary Search Tree Postorder: ");
    postorderTraversal(root);
    printf("\n");

    return 0;
}