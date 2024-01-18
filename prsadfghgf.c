# include<stdio.h>
void main(){
    int a[10][10],ktemp[10][100],r1,c1,k=0;
    int b[10][10],ktem[10][100],r2,c2,l=0;
    int i , j;
    int sum=0;
    printf("\t\t Enter 1. matrix \t\t\n");
    printf("Enter row :-\n");

    scanf("%d",&r1);

    printf("Enter col :-\n");

    scanf("%d",&c1);
    printf("\t enter matrix\n");
    for(i=0;i<r1;i++){

        for(j=0;j<c1;j++){

            scanf("%d",&a[i][j]);
            if(a[i][j]!=0){
                ktemp[0][k]=i;
                ktemp[1][k]=j;
                ktemp[2][k]=a[i][j];
                k++;
            }
        }
    }
    printf("\t\t enter sparse matrix\n");
    for(i=0;i<k;i++){

        for(j=0;j<k;j++){
            printf("%d",ktemp[i][j]);
        }
        
    }
    printf("\t\t Enter 2. matrix \t\t\n");
    printf("Enter row :-\n");

    scanf("%d",&r2);

    printf("Enter col :-\n");

    scanf("%d",&c2);
    printf("\t enter matrix\n");
    for(i=0;i<r2;i++){

        for(j=0;j<c2;j++){

            scanf("%d",&a[i][j]);
            if(a[i][j]!=0){
                ktem[0][l]=i;
                ktem[1][l]=j;
                ktem[2][l]=a[i][j];
                l++;
            }
        }
    }
    printf("\t\t enter sparse matrix\n");
    for(i=0;i<l;i++){

        for(j=0;j<l;j++){
            printf("%d",ktem[i][j]);
        }
                                                prinf("\n");
    }

    if(r1==r2&&c1==c2){
        printf("Addition is perform\n");
        for (i=0;i<k;i++){

            for(j=0;j<k;j++){
                
                sum=sum+(ktemp[i][j]+ktem[i][j]);
            }
            printf("\n");
        }
        printf("%d",sum);
    }
    
    else{
        printf("not perform");
    }
    

}