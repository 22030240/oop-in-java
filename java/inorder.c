#include <stdio.h>
#include <stdlib.h>
struct node
{
 int data;
 struct node *left, *right;
};
struct node *create()
{
 int x;
 struct node *newnode;
 newnode = (struct node *)malloc(sizeof(struct node));
 printf("Enter data:->( -1 for no node )");
 scanf("%d", &x);
 if (x == -1)
 {
 return NULL;
 }
 newnode->data = x;
 printf("\nEnter left child of:-> %d ", x);
 newnode->left = create();
 printf("\nEnter right child of:-> %d ", x);
 newnode->right = create();
 return newnode;
}
// Preorder Traversal : Root-Left-Right
void preorder(struct node *root)
{
 if (root == NULL)
 {
 return;
 }
 printf("%d ", root->data);
 preorder(root->left);
 preorder(root->right);
}
// Inorder Traversal : Left-Root-Right
void inorder(struct node *root)
{
 if (root == NULL)
 {
 return;
 }
 inorder(root->left);
 printf("%d ", root->data);
 inorder(root->right);
}

void postorder(struct node *root)
{
 if (root == NULL)
 {
 return;
 }
 postorder(root->left);
 postorder(root->right);
 printf("%d ", root->data);
}
int main()
{
 struct node *root;
 root = NULL;
 root = create();
 printf("\nPreOrder Traversal : ");
 preorder(root);
 printf("\nInOrder Traversal : ");
 inorder(root);
 printf("\nPostOrder Traversal : ");
 postorder(root);
}