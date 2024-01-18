import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number to chack its prime or not:");
        int n=sc.nextInt();
        boolean isprime=true;
        
        if(n==2){
            System.out.println("2 is prime number ");
            
        }
        else{
            for(int i=2;i<=n-1;i++){
            if(n%i==0){// n multiplical is not equal to 1 and n
             isprime=false;
            }
            
            }
            if(isprime==true){
                System.out.println("Number is prime:");
            }
            else{
                System.out.println("Number is not prime:");
            }
       
        }
        
    

        
    }
    
}
