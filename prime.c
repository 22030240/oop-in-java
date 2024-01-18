#include<stdio.h>
int main()
{
    int i,num,a=0;
    printf("Enter no:");
    scanf("%d",&a);
    for(int i=2;i<num/2;i++){
        if (num%i==0)

        {
         a=1;
         break;

        }
       
        
    }
    if (a==0)
    {
        printf("%d is a prime number",num );
    }
    
return 0;
}