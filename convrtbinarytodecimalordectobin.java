import java.util.Scanner;

public class convrtbinarytodecimalordectobin { // 101=2^2+2^1+2^0
    public static int binTodec(int bnum){       //    =4+2+1=7
        int dec=0;
        int pow=0;
        while(bnum>0){
           int last_d=bnum%10;// 101  ->1
           dec= dec+(last_d* (int)Math.pow(2,pow));// 0+(1*2^0)=1 /2./ 1+(0*2^1)=1/3/1+2^2=5
           pow++;
           bnum/=10;
        }
        return dec;
    }
    public static int dicTobin(int num){
        int bin_num=0;
        int pow=0;
        while(num>0){
            int rem=num%2;//  1
            bin_num=bin_num+(rem*(int)(Math.pow(10,pow)));// 0+1*10^0=1 /2/ 1+(0*10^1)=0/3/ 
            pow++;
            num/=2;
        }
        return bin_num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary num:");
        int x=sc.nextInt();
        System.out.println("Decimal no is: "+binTodec(x));
        System.out.print("Enter any decimal no:");
        int y=sc.nextInt();
        System.out.println("Binary no is: "+dicTobin(y));
        
    }
    
}
