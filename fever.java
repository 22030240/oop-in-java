import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  body temperature:");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("fever");
        }
        else{
            System.out.println("not fever");
        }
    }
    
}
