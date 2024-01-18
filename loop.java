import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int counter=1;
       System.out.println("Enter limit:");
       int range=sc.nextInt();
       int sum=0;
       while(counter<=range){
        sum=sum+counter;

counter++;
       }
       System.out.println("sum of 1 to "+range+" : "+sum);
    }
    
}
