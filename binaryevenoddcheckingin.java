import java.util.Scanner;

public class binaryevenoddcheckingin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter any no:");
        int num=sc.nextInt();
        int bit=1;
        if((num & bit)==0){
            System.out.println("even no:");
        }
        else{
            System.out.println("odd no:");
        }
    }
    
}
