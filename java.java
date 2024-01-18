import java.util.Scanner;

public class java {
    public static void main(String[]arg){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of a &b &c :");
        System.out.println("Enter value of a:");
        int a= sc.nextInt();
        System.out.println("Enter value of b:");
       int  b= sc.nextInt();
       System.out.println("enter value of c:");
       int c=sc.nextInt();
       if(a>b){
        if(a>c){
            System.out.println("a is gretter than b and c"+"  "  +a);
        }
        else{
            System.out.println("c is gretter than a and b"   +c);
        }
        
       }
       else{
        if(b>c){
            System.out.println("b is gretter than a and c"   +b);
        }
        else{
            System.out.println("c is gretter than a and b"   +c);
        }
       }
       

    }
    
}
