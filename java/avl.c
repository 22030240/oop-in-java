#include <stdio.h>
#include <stdlib.h>
struct node
{
 int data;
 struct node *left, *right;
};
struct node *newNode(int x)
{
 struct node *p;
 p = malloc(sizeof(struct node));
 p->data = x;
 p->left = NULL;
 p->right = NULL;
 return p;
}
struct node *insert(struct node *root, int x)
{
 if (root == NULL)
 {
 return newNode(x);
 }

 else if (x > root->data)
 {
 root->right = insert(root->right, x);
 }
 else
 {
 root->left = insert(root->left, x);
 }
 return root;
}
void Display_Inorder(struct node *root)
{
 if (root != NULL)
 {
 Display_Inorder(root->left);
 printf(" %d ", root->data);
 Display_Inorder(root->right);
 }
}
int main()
{
 struct node *root = NULL;
 int ch;
 while (1)
 {
 int ch, num;
 printf("1. Insert\n2. Display\n3. Exit\n\nEnter Your Choice : ");
 scanf("%d", &ch);
 switch (ch)
 {
 case 1:
 printf("Enter the element to insert : ");
 scanf("%d", &num);
 root = insert(root, num);
 break;
 case 2:
 Display_Inorder(root);
 break;
 case 3:
 return 0;
 break;

 default:
 break;
 }
 }
 return 0;
}