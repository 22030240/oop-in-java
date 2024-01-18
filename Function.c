#include <stdio.h>
void sub(){
    int d,g,sub=0;
    printf("Enter any value to substract:");
    scanf("%d %d",&d,&g);
    sub=d-g;
    printf("sub=%d\n",sub);

}
void sum(){
    int a,b,sum=0;
    printf("Enter two number:");
    scanf("%d %d",&a,&b);
    sum=a+b;
    printf("sum=%d\n",sum);

}
void main()
{
    sum();
    printf("hellow world\n");
    sum();
    sum();
    printf("Akshay dange ");
    sub();
}