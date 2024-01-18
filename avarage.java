import java.util.Scanner;

public class avarage {
    public static int average1(int x,int y,int z){
        int av=(x+y+z)/3;
        return av;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 1 value:");
        int a=sc.nextInt();
        System.out.print("Enter 2. value: ");
        int b=sc.nextInt();
        System.out.println("Enter 3.value: ");
        int c=sc.nextInt();
        int avg=average1(a, b, c);
        System.out.println("average of three no is: "+avg);
        
    }
    
}
