#include<stdio.h>
int sumofdigit(int n);
int main (){
    int num;
    int total;
    printf("Enter the number ");
    scanf("%d", &num);

    total = sumofdigit(num);
    printf("%d",total);
    
}
int sumofdigit(int n){
    if(n==0){
        return 0;
    }
    int sum=0;
    while(n<0){
        int reme=n%10;
        sum=sum+reme;
        n/=10;
    }
    printf("Sum of digit is:",sum);
    

}