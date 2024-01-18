import java.util.Scanner;

public class palind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row in pattern");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i;j++){
                
               System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
}
