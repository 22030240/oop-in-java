# include<stdio.h>
int main(){
    int num;
    int sum=0;
    int r;
    printf(" enter the number\t");
    scanf("%d",&num);
    while(num!=0){
        r=num%10;
        sum=sum+r;
        num=num/10;
    }
    printf("sum is %d:-",sum);
    return 0;
}