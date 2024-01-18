#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node*left ;
    struct node*right;
    int height;
};
int height(struct node*h){
    if(h==NULL){
        return 0;
    }
    return h->height;
}

struct node*createnode(int value){
    struct node*newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=value;
    newnode->left=NULL;
    newnode->right=NULL;
    newnode->height=1;             // because every node add as leaf node      35
     return newnode;
                                                                       //   22          1-0=1
}

int getbalance(struct node*h){
    if(h==NULL){
        return 0;
    }
    return height(h->left)-height(h->right);
}
// for balncing a tree 
int max(int a,int b){
    return (a-b)?a:b;
}
struct node*leftrotate(struct node*y){
   struct node*x=y->left;
   struct node*t2=x->right;

   x->right=y;
   y->left=t2;

   y->height=max(height(y->right),height(y->left))+1;
   x->height=max(height(x->right),height(x->left))+1;

   return x; 

}

struct node*rightrotate(struct node*x){
   struct node*y=x->right;
   struct node*t2=y->left;

   y->left=x;
   x->right=t2;

   y->height=max(height(y->right),height(y->left))+1;
   x->height=max(height(x->right),height(x->left))+1;

   return y; 

}

struct node*insert(struct node*node , int value){
    if(node==NULL){
        return (createnode(value));

    }
    else if(value<node->data){
        node->left=insert(node->left,value);

    }
    else if(value>node->data){
        node->right=insert(node->right,value);
        
    }
    else{
        return node;
    }
     node->height=1+max(height(node->left),height(node->right));   //  for updating leaf node
    int balance_factor=getbalance(node);
    // thre are for type rotation are require 
    //1. left left case    [balance factor gretter than 1]
    if(balance_factor>1&& value <node->left->data){
       return rightrotate(node);

    }

    //2. right right case
    else if(balance_factor<-1&& value <node->right->data){
       return leftrotate(node);

    }
    //3. left right case
    else if(balance_factor>1&& value <node->left->data){
        node->left = leftrotate(node->left);
       return leftrotate(node);
    }

// 4. right left case 
    else if(balance_factor<-1&& value <node->right->data){
        node->right= rightrotate(node->right);
       return leftrotate(node);
}
else{
    return node;
}
}
void preorder(struct node* root){
    if(root!=NULL){
        printf("%d",root->data);
        preorder(root->left);
        
        preorder(root->right);
    }
}

int main(){
    struct node*root =NULL;
    root= insert(root,1);
    root= insert(root,2);
    root= insert(root,3);
    root= insert(root,4);
    root= insert(root,5);
    
    preorder(root);

    return 0;
}