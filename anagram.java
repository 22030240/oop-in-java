import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1.string:");
        String str1=sc.nextLine();
        System.out.println("Enter 2.string");
        String str2=sc.nextLine();
        // firstly check its length is same or not;
        if(str1.length()==str2.length()){
            // convert string into array
            char[] str1chararry = str1.toCharArray();
            char[] str2chararry = str2.toCharArray();
            // sort the array
            Arrays.sort(str1chararry);
            Arrays.sort(str2chararry);
            // if the sorted array are same or identicle then string are anagram
            boolean result=Arrays.equals(str1chararry, str2chararry);
            if(result){
                System.out.println(str1+"and"+str2+"are anagram of each other.");
            }
            else{
                System.out.println(str1+"and"+str2+"are not anagram:");
            }
        }
        else{
            System.out.println(str1+"and"+str2+"are not anagram:");
        }
    }
    
}
