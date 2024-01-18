#include <stdio.h>
#include <stdlib.h>
// Structure for a node in the AVL Tree
struct Node
{
 int key;
 struct Node *left;
 struct Node *right;
 int height;
};
// Function to get the height of a node
int getHeight(struct Node *node)
{
 if (node == NULL)
 return 0;
 return node->height;
}
// Function to calculate the maximum of two integers
int max(int a, int b)
{
 return (a > b) ? a : b;
}
// Function to create a new node with the given key
struct Node *createNode(int key)
{
 struct Node *node = (struct Node *)malloc(sizeof(struct Node));
 node->key = key;
 node->left = NULL;
 node->right = NULL;
 node->height = 1;
 return node;
}
// Function to right rotate a subtree rooted with y
struct Node *rightRotate(struct Node *y)
{
 struct Node *x = y->left;
 struct Node *T2 = x->right;
 // Perform rotation
 x->right = y;
 y->left = T2;
 // Update heights
 y->height = max(getHeight(y->left), getHeight(y->right)) + 1;

 x->height = max(getHeight(x->left), getHeight(x->right)) + 1;
 return x;
}
// Function to left rotate a subtree rooted with x
struct Node *leftRotate(struct Node *x)
{
 struct Node *y = x->right;
 struct Node *T2 = y->left;
 // Perform rotation
 y->left = x;
 x->right = T2;
 // Update heights
 x->height = max(getHeight(x->left), getHeight(x->right)) + 1;
 y->height = max(getHeight(y->left), getHeight(y->right)) + 1;
 return y;
}
// Function to get the balance factor of a node
int getBalance(struct Node *node)
{
 if (node == NULL)
 return 0;
 return getHeight(node->left) - getHeight(node->right);
}
// Function to insert a key into the AVL Tree
struct Node *insert(struct Node *node, int key)
{
 // Perform the normal BST insertion
 if (node == NULL)
 return createNode(key);
 if (key < node->key)
 node->left = insert(node->left, key);
 else if (key > node->key)
 node->right = insert(node->right, key);
 else // Duplicate keys are not allowed in AVL Tree
 return node;
 // Update the height of the current node
 node->height = 1 + max(getHeight(node->left), getHeight(node->right));
 // Check the balance factor of the current node
 int balance = getBalance(node);
 // Left Left Case
 if (balance > 1 && key < node->left->key)
 return rightRotate(node);

 // Right Right Case
 if (balance < -1 && key > node->right->key)
 return leftRotate(node);
 // Left Right Case
 if (balance > 1 && key > node->left->key)
 {
 node->left = leftRotate(node->left);
 return rightRotate(node);
 }
 // Right Left Case
 if (balance < -1 && key < node->right->key)
 {
 node->right = rightRotate(node->right);
 return leftRotate(node);
 }
 return node;
}
// Function to print the pre-order traversal of the AVL Tree
void preOrderTraversal(struct Node *root)
{
 if (root != NULL)
 {
 printf("%d ", root->key);
 preOrderTraversal(root->left);
 preOrderTraversal(root->right);
 }
}
// Function to print the balance factor of each node in the AVL Tree
void printBalanceFactors(struct Node *root)
{
 if (root != NULL)
 {
 printf("Node: %d, Balance Factor: %d\n", root->key, getBalance(root));
 printBalanceFactors(root->left);
 printBalanceFactors(root->right);
 }
}
int main()
{
 struct Node *root = NULL;
 // Insert nodes into the AVL Tree
 root = insert(root, 10);
 root = insert(root, 20);
 root = insert(root, 30);
 root = insert(root, 40);
 root = insert(root, 50);
 root = insert(root, 25);

 printf("Pre-order Traversal: ");
 preOrderTraversal(root);
 printf("\n\nBalance Factors:\n");
 printBalanceFactors(root);
 return 0;
}