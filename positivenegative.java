import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int number=sc.nextInt();
        if(number==0){
            System.out.println("Enter number is zero:  "+number);
        }
        else if(number<0){
            System.out.println("enter number is negative because its less than zero  "+ number);
        }
        else{
            System.out.println("Enter number is positive because its gretter than zero:  "+number);
        }
    }
    
}
