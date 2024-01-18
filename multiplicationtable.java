import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        int num=sc.nextInt();
        int i=1;
        while(i<=10){
            int mul=num*i;
            System.out.println(num+"*"+i+"="+mul);
            i++;
        }

    }
    
}
