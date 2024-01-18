import java.util.Scanner;

public class findeven {
    public static boolean evenno(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any even or odd no:");
        int num=sc.nextInt();
        System.out.println(evenno(num));
        
    }
    
}
