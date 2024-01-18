import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        System.out.println("Enter which operation u preform in calculator :");
        char ch=sc.next().charAt(0);

        switch(ch){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            if(a>b){
                System.out.println(a/b);
            }
            else{
                System.out.println(b/a);
            }
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("Use above any operation:");
        }
    }
    
}
