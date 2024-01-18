#include<stdio.h>
#include<stdlib.h>

void insertAtfrist();
void insertAtlast();
void insertRandom();
void deletAtfrist();
void deletAtlast();
void deletRandom();
void display();

struct node{
    int data;
    struct node*next;

};

struct node*head;
void main(){
    int ch;
    printf("......WELCOME IN SINGLE LINKED LIST........\n");
    printf("1.insertAtfrist()\n");
    printf("2.insertAtlast() \n");
    printf("3.insertRandom()\n");
    printf("4.deletAtfrist()\n");
    printf("5.deletAtlast()\n");
    printf("6.deleRandom()\n");
    printf("7.display()\n");
    printf("8.Exit()\n");
    printf("........ Thanku..........\n");

while (1)
{
    printf("Enter choice code\n ");
    scanf("%d",&ch);

    switch (ch)
    {
    case 1:insertAtfrist();
        break;
    case 2:insertAtlast();
    break;
    case 3:insertRandom();
    break;
    case 4:deletAtfrist();
    break;
    case 5:deletAtlast();
    break;
    case 6:deletRandom();
    break;
    case 7:display();
    break;
    case 8:exit(0);
    break;
    default:
    printf(" Enter anoder numbur inbetween 1 to 8 \n");
break;

    
    
    }
}


}
