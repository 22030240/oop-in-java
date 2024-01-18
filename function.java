import java.util.Scanner;

public class function {
    public static int sumofnum(int a,int b){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=sumofnum(x,y);
        System.out.println(sum);
         return a+b;
        
    }
    public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        return f;
    }
    //public static int product(int a , int b){
       // return a*b;
   // }
    public static int binomialcoe(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_rmn=factorial(n-r);
        int binomical=fact_n/fact_r*fact_rmn;
        return binomical;
    }
    public static void main(String[] args) {
        System.out.println(binomialcoe(5, 2));
        
    }
    
}
