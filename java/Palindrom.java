import java.util.*;



public class Palindrom {
    public static void main(String[] args) {
        int row,col;
        System.out.println("enter no of rows");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("enter no column");
        col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.println("* ");
            }
            System.out.println("/n");
        }
        
    }
    
}
