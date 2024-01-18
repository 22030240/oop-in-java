import java.util.Scanner;
public class simpleinterest {
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("take userinput from user:");
        System.out.println("1.principle value is:");
        int p=sc.nextInt();
        System.out.println("2.Rate value is : ");
        int r=sc.nextInt();
        System.out.println("Time value is :");
        int t=sc.nextInt();

        int si;
        si=(p*r*t)/100;

        System.out.println("Total principle value is:"+si);

        System.out.println("second problem is start:");
        System.out.println("Take again two userinput from user ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two number is "+sum);

    }
    
}
