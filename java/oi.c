#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* left;
     struct node* right;
};

struct node* create(){
    int x;
    struct node* newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    
    printf("Enter value (if -1 then null):->");
    scanf("%d",&x);
    if(x==-1){
        return NULL;
    }
    newnode->data=x;
    printf("enter the left subnode of %d",x);
    newnode->left=create();
    printf("enter the right subnode of %d",x);
    newnode->right=create();
    return newnode;

}
void preorder(struct node* root){
    if(root == NULL){
        return NULL;
    }
    printf("%d",root->data);
    preorder(root->left);
    preorder(root->right);
}
int main(){
    struct node* root;
    root=NULL;
    root=create();
    printf("preorder transversal ");
    preorder(root);
   
}