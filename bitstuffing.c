#include<stdio.h>
int main(){
    int orignal_frame[20],bit_stuff[20];
    int count=0, i,j,k;
    int size;
    printf("Enter the size of frame:");
    scanf("%d",&size);
    // enter the information code
    printf("Enter the information code");
    for(int i=0;i<size;i++){
        scanf("%d",&orignal_frame[i]);
    }
    printf("given information code is:");
    for(int i=0;i<size;i++){
        printf("%d",orignal_frame[i]);
    }
    i=0;
    j=0;
    count=0;
    while(i<size){
        if(orignal_frame[i]==1){
            bit_stuff[j]=orignal_frame[i];
            for(k=i+1;orignal_frame[k]==1&&k<5;k++){
                j++;
                bit_stuff[j]=orignal_frame[k];
                count++;
                if(count==5){
                    
                    bit_stuff[j]=0;
                    
                    bit_stuff[j++]=orignal_frame[i];
                }
                i=k;
            }
        }
        else{
            bit_stuff[j]=orignal_frame[i];
        }
        i++;
        j++;
    }
        
    printf("Final bit stuffing is:");
    for( i=0;i<j;i++){
        printf("%d",bit_stuff[i]);
    }
    return 0;
}