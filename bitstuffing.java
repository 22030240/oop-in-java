import java.util.Scanner;

public class bitstuffing {
    public static String bit(String bitstuff){
   String newstring="";
   for(int i=0;i<bitstuff.length();i++){
    Integer count =1;
    while(i<bitstuff.length()-1 && bitstuff.charAt(i)=='1' && bitstuff.charAt(i)==bitstuff.charAt(i+1)){
        newstring+=bitstuff.charAt(i);
        count++;
        i++;
    }
    newstring+=bitstuff.charAt(i);
    if(count>5){
        newstring+=count.toString(0);
        
      }
   }
   return newstring;

    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your information having combination of 0 and 1:");
        String bitstuff;
        bitstuff=sc.nextLine();
        System.out.println("your information is before bit stuffing is:"+bitstuff);
        
        System.out.println(bit(bitstuff));

    }
}
    

