import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number: ");
       int num=sc.nextInt();
        int reverse=0;
      while(num>0){
        int last=num%10;
         reverse=(reverse*10)+last;
         
         num/=10;

      }
      System.out.println(reverse);
        
        }
    }
    

