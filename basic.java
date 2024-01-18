import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value: ");
        int b=sc.nextInt();
        String larger=(a>b)?"yes":"NO";
        System.out.println(a+" is gretter than "+b+" "+larger);
    }
    
}
