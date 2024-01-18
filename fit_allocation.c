#include<stdio.h>
//first fit static allocation
int main()
{
int i, j, flag=0, n, count;
printf("\nEnter the number of memory partition : ");
scanf("%d", &n);
int arr[n];
printf("\nEnter the values of memory partition : ");
for(int i=0; i<n; i++)
scanf("%d", &arr[i]);
int choice, process;
do
{
printf("\n\n--------------------------");
printf("\n1. To enter the process ");
printf("\n2. Exit");
printf("\n--------------------------");
printf("\nEnter your choice : ");
scanf("%d", &choice);
switch(choice)
{
case 1:
printf("\n\nEnter the process : ");
scanf("%d", &process);
for(j=0; j<n; j++)
{
count++;
if(arr[j] >= process)
{
printf("\n%d is allocated to %d", process, arr[j]);
arr[j] = 0;
count=0;
break;
}
}
if(count!=0)
printf("\n%d is in wait state");
break;
case 2:
printf("\nThank You");
}
} while (choice != 2);
return 0;
}