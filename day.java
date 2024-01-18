import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        System.out.println("Enter number of day:");
        int number=sc.nextInt();
        switch(number){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("weanesday");
            break;
            case 4:
            System.out.println("tousday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("Enter number in bet 1 to 7:");
             
        }

    }
    
}
