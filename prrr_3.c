# include<stdio.h>
# include<string.h>
#define max 20


struct bookdetail
{
char book_id[20];
char book_title[20];
char author_name[20];
int price;
int pageno;
};

void output(struct bookdetail v[],int n);


void main(){
    struct bookdetail b[max];
    int num;
    int i;
    printf("=:= Enter the no of book =:=\n");
    scanf("%d",&num);
    printf("\n");
    for (i=0;i<num;i++){
        printf(":=: Book %d details:=:\n",i+1);
        printf(" \n Enter the book_id \n");
        scanf("%s",b[i].book_id);
        printf("*Enter the book title \n ");
        scanf("%s",b[i].book_title);
        printf("Enter the author_name \n");
        scanf("%s",b[i].author_name);
        printf("Enter the price of book\n");
        scanf("%d",&b[i].price);
        printf("how much page in this book\n");
        scanf("%d",&b[i].pageno);

        

 

    }
    printf("\n");
    output(b,num);

}

void output(struct bookdetail v[],int n){
    int i;
    int t=1;

    for(i=0;i<n;i++,t++){
        printf("=:Book %d details:=\n",t);
        printf("\t\tBook %d book-id is:=%s\n ",t,v[i].book_id);

        printf("\t\t book%d book_title is:=%s\n",t,v[i].book_title);

        printf("\t\t book%d authour_name is:=%s\n",t,v[i].author_name);

        printf("\t\t book%d price is :=%d\n",t,v[i].price);

         printf("\t\t book%d pageno is :=%d\n",t,v[i].pageno);

         printf("\n");


    }
}