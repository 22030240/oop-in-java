#include <stdio.h>
int main(){
    int flag=0;
    int i;
    int num;
    printf("Enter No:\n");
    scanf("%d",&num);
    if(num==0||num==1){
        printf("Enter no is not prime no:%d",num);
    
    }
   for(i=2;i<num;i++){
    if(i%2==0){
        flag++;
    }
   }
   
   if(flag==1){
    printf("enter no is not prime no");
   }
   else{
    printf("enter no is prime no");
   }
   return 0;
}