import java.util.Scanner;

public class facorials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no :");
        int num=sc.nextInt();
        double fact=1;
        // factorial means ->4!=4*3*2*1
for(int i=1;i<=num;i++){
    fact*=i;
}

System.out.println("Factorial of this no is:"+fact);
    }

    
}
