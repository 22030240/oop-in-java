#include <stdio.h>
#define max 5
 
 
 stack_arr[max];
 int top=-1;
 
 int main(){
     
    
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    
    return 0;

 }

 void push(int n){
    if(top==max-1){
        printf(" stack is overflow\n");
        

    }top=top+1;
    stack_arr[top]=n;

 }
 