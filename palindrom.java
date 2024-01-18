import java.util.Scanner;

public class palindrom {
    public static int palindeono(int num){
        int pali=num;
        int reverse=0;
        while(pali!=0){
            int last_di=pali%10;
            reverse=( reverse * 10) +last_di;
            pali/=10;
            
        }
        if(num==reverse){
            System.out.println("Enter no is palindrom no:"+num);
        }
        else{
            System.out.println("Enter no is not a palindrom no: "+num);
        }
        return num;
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any no to chack its palindrom or not:");
        int num=sc.nextInt();
        System.out.println (palindeono(num));

        
    }
    
}
