#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node*right;
    struct node*left;
};
struct node *createnode(int data){
    struct node*new;
    new=(struct node*)malloc(sizeof(struct node));
    new->data=data;
    new->left=NULL;
    new->right=NULL;
    return new;
}
void inorder(struct node* root){
    if(root!=NULL){
        inorder(root->left);
        printf("%d",root->data);
        inorder(root->right);
    }
}
void insert(struct node*root,int value){
    struct node*prev=NULL;
    while(root!=NULL){
        prev=root;
        if(value==root->data){
            printf("Cannot insert because same value\n");
            return;
        }
        else if(value <root->data){
            root=root->left;

        }
        else{
            root=root->right;
        }

    }
    struct node*new=createnode(value);
    if(value<prev->data){
        prev->left=new;

    }
    else{
        prev->right=new;
    }
}
struct node*search(struct node*root,int key){
    while(root!=NULL){
        if(key==root->data){
            printf("element founted in binary search tree");
        }
        else if(key<root->data){
            root=root->left;

        }
        else{
            root=root->right;
        }
    }
    return NULL;
}
void main(){
    struct node*p=createnode(5);
    struct node*p1=createnode(3);
    struct node*p2=createnode(6);
    struct node*p3=createnode(1);
    struct node*p4=createnode(4);

    p->left=p1;
    p->right=p2;
    p1->left=p3;
    p1->right=p4;
    insert(p,16);

    printf("%d",p->right->right->data);
    



}
