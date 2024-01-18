#include<stdio.h>
void isprime(int n ){
   
    int i;
    int count=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0){
            count++;
        }
    }
    if (count==2)
    {
        printf("Enter no is a prime\n");
    }
    else{
        printf(" enter no is not a prime");
    }
    

}
void main(){
    int n;
    printf("Enter no:");
    scanf("%d",&n);
    isprime(n);

}

