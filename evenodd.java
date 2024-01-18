import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int evenadd=0;
        int oddadd=0;
        int choice;
        do{
            
            System.out.println("Enter number: ");
            number=sc.nextInt();
            if(number%2==0){
                
                 evenadd=evenadd+number;
            }
            else{
                oddadd+=number;
            }


            System.out.println("Do u want to continue? press 1 and press 0 for not");
            choice=sc.nextInt();


        }while(choice==1);

        System.out.println("Sum of even number is: "+ evenadd);
        System.out.println("Sum of odd number is: "+ oddadd);
    }
    
}
