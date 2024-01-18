import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("FIND OUT LARGER NUMBER BEETWEEN THREE VALUES ");
        System.out.println("Enter 1.value");
        int a=sc.nextInt();
        System.out.println("Enter 2.value");
        int b=sc.nextInt();
        System.out.println("Enter 3.value");
        int c=sc.nextInt();
    if(a>b&&a>c){
        System.out.println("a is gretter than b and c "+a);
    }
    else if(b>c){
        System.out.println("b is gretter than a and c "+b);

    }
    else{
        System.out.println("c is gretter than a and b "+c);
    }
    }
    
}
