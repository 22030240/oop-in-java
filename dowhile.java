import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i=sc.nextInt();

        do{
            if(i==3){
                continue;
            }
            i++;
            
            
        }while(i<10);
    }
    
}
