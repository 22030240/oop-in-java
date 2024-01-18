# include<stdio.h>

struct complex{
    int real;
    int img;
};
void read()
{
    struct complex a,b;
    printf(" 1.Enter real and complex number \n");
    scanf("%d%d",&a.img,&a.real);

    printf("2. enter real and complex number \n");
    scanf("%d%d",&b.img,&b.real);
}
void write(){
    struct complex a,b;
    printf(" First complex number:-%di+%d\n",a.img,a.real);

    printf(" second complex number:-%di+%d\n",b.img,b.real);
}
void addition(){
    struct complex a,b,c;
    c.real=a.real+b.real;
    c.img=a.img+b.img;
    printf("\t\taddition of complex no is:- %d+%di\n",c.real,c.img);
    
}
void substraction(){
    struct complex a,b,c;
    c.real=a.real-b.real;
    c.img=a.img-b.img;
    printf(" \t\tsubstraction of complex no is :-%d-%di\n",c.real,c.img);
}
void multiplication(){
    struct complex a,b,c;
    c.real=a.real*b.real;
    c.img=a.img*b.img;
    printf("\t\tmultiplication of complex no is:- %d*%di\n",c.real,c.img);
}
void main(){
    printf ("addition**** substraction****multiplication***\n");
    read();
    write();
    addition();
    printf("\n");
    substraction();
    printf("\n");
     multiplication();

}