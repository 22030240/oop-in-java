import java.util.Scanner;
// check number is special or not.

public class Special { 
      
    public static void main(String[] args) {
        int num,number ,sum=0,last_num_rum;
        int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
number=sc.nextInt();
num=number;
while(number!=0){
    last_num_rum=number%10;//153
    for(int i=1;i<last_num_rum;i++){
        fact=fact*i;//2*5+6
    }
    sum=sum+fact;//6
   number= number/10;
}
if(sum==num){
    System.out.println(num+"Number is a special number");
}
else{
    System.out.println(num+" not a special number");
}
        

        
    }
    }  
    