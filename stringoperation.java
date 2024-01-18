import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class stringoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str;
         System.out.print("Enter a string:");
         str=sc.nextLine();
         System.out.println("Entered string is:"+str);
         
         for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
            }
            
         }
         return true;
         
         System.out.print(str);
    }

    
}
