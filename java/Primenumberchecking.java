
import java.util.*;

public class Primenumberchecking {
    public static void main(String[] args) {
        int i,num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        num =sc.nextInt();
        for(i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
                break;
            }

        }
        if(count==0 &&num!=1){
            System.out.println("is a prime no");
        }
        else{
            System.out.println("not prime");
        }

    }
    
}
