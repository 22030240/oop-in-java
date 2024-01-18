import java.util.HashMap;
import java.util.Scanner;

public class target {
    public static void main(String[] args) {
    
        int array[]={1,11,2,3,4,6,5};
        Scanner sc=new Scanner(System.in);
        int target;
        int newaray[]=new int [2];
        System.out.println("Enter targer value:");
        target=sc.nextInt();
        for(int i=0;i<array.length;i++){
           int sub=target-array[i];
           if(array[i]==sub){
            newaray[0]= array[i];
            newaray[1]=i;
            break;
           }
        }
        System.out.println(newaray[1]+","+newaray[0]);
    }
    
}
