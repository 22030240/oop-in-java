#include<stdio.h>
//first fit static allocation
int main()
{
int i, j, n, count,k;
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
printf("\nEnter your choice 1. for static and 2. for dynamic : ");
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
//k=arr[j]-process;
//printf("\n%d  after allocating difference is:->%d ",arr[j],k);
arr[j] = 0;
count=0;
break;
}
}
if(count!=0)
printf("\n%d is in wait state");
break;
case 2:
printf("\n\nEnter the process : ");
scanf("%d", &process);
for(j=0; j<n; j++)
{
count++;
if(arr[j] >= process)
{
    k=arr[j]-process;
printf("\n%d is allocated to %d(%d)", process, arr[j],k);
//k=arr[j]-process;
//printf("\n%d  after allocating difference is:->%d ",arr[j],k);
arr[j] = k;
count=0;
break;
}
}
if(count!=0)
printf("\n%d is in wait state");
break;

}
} while (choice != 3);
 return 0;
}
