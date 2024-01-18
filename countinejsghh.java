import java.util.Scanner;

public class countinejsghh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enters nus:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("print no:"+n);
        }while(true);
    }
    
}
