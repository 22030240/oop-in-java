# include<stdio.h>
# define max 5
int quque[max];
int f=-1;
int r=-1;
void enquque();
void denquque();
void display();
void getfront();
int main{
    int ch;
    printf("\n\t************* Quque operation *************\n");
    printf("\t 1.enquque()\n 2.dequque()\n 3.display()\n 4.getfront()\n");
    printf("\t ********************************************\n");
    while(1){
        printf("\t Enter choice code\t\n");
        scanf("%d",&ch);
        printf("%n");
        switch (ch)
        {
        case 1:
            enquque();
            break;
        case 2:{

        
            denquque();
            break;
        }    
        case 3:{
            display();
            break;
        }
        case 4:
            getfront();
            break;

        case 5:
            exit(0);
            break;

        default:
        printf(" choose valid choice code:-")
            break;
        }
    }
}