import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to chack is even or odd:");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Number is even:  "+number);
        }
        else{
            System.out.println("Number is odd:   "+number);
        }
    }
    
}
