import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter income of user: ");
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income>500000&&income<1300000){
            tax=(int)(income*0.3);
        }
        else{
            tax=(int)(income*0.5);
        }

    System.out.println("Tax of given income is:  "+tax);
    }
    
}
