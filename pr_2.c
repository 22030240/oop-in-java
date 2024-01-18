# include<stdio.h>

int sum_of_array(int *arr,int n){
    int sum=0;
    int i=0;
    for(int i=0;i<n;i++){
        sum = sum + arr[i] ;
    }
return sum;
}
int main(){
    int total=0;
    int array[10];
    int nq ;
    printf("Enter the size of array\n");
    scanf("%d",&nq);
    printf("Enter the enter the element \n");
    for(int i=0;i<nq;i++){
        scanf("%d",array[i]);
    }
total= sum_of_array(array,9);
printf("%d",total);
return 0;
}