#include<stdio.h>

void max_heap(int arr[],int n,int i){
    int largest=i;
    int child1=2*i+1;
    int child2=2*i+2;
    if(child1<n&& arr[child1]>arr[largest]){
        largest=child1;
    }
    if(child2<n&&arr[child2]>arr[largest]){
        largest=child2;
    }
    if(largest!=i){
        int temp=arr[largest];
        arr[largest]=arr[i];
        arr[i]=temp;
        max_heap(arr,n,largest);
    }
}
void buildheap(int arr[],int n){
    int i;
    for(i=n/2;i>=0;i--){
        max_heap(arr,n,i);


    }
}
void deleteheap(int arr[],int n){
    int lastelement=arr[n-1];
    arr[0]=lastelement;
    n=n-1;
    max_heap(arr,n,0);
}
int main(){
    int choice,n,arr[100];
    while(1){
        printf("\n**************max heap**********\n");
        printf("\n1. create a max heap");
        printf("\n2.delete a max heap:");
        printf("\n3.exit");
        printf("\n enter your choice:");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("Enter the size of array:");
            scanf("%d",&n);
            printf("Enter the element in array[]:");
            for(int i=0;i<n;i++){
                scanf("%d",&arr[i]);
            }
            buildheap(arr,n);
            printf("\n................................\n");
            for(int i=0;i<n;i++){
                printf("%d ",arr[i]);
            }
            printf("\n................................\n");
            break;
        case 2:
        deleteheap(arr,n);
        printf("\n................................\n");
        printf("Max heap is:");
            for(int i=0;i<n;i++){
                printf("%d ",arr[i]);
            }
            printf("\n................................\n");

        break;
        default:
        printf("invalid");
            break;
        }
    }
}