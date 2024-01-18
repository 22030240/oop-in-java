import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of user:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("User is adult because having age is +18:  "+age);
        }
        else if(age>=13&&age<18){
            System.out.println("user is teeneger having age in bitween 13:18  "+age);
        }
        else{
            System.out.println("user is child having age less than 13:"+age);
        }
    }
    
}
