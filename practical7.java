import java.util.Scanner;
public class practical7 {
     static int Gcd(int c,int d){
int result=0;
for(int i=1;i<c&&i<d;i++){
    if(c%i==0&&d%i==0){
        result=i;
    }
}
return result;
 
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter two integer values:-><><>");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Gcd number is:->"+Gcd(a,b));
    }
    
}
