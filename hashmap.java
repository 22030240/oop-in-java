import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,2,4,5,8,11,2,3};
        System.out.println("Enter target value:");
        int target=sc.nextInt();
        int naray[]=new int [2];
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        int sno=target-arr[i];
        if(map.containsKey(sno)){
            naray[0]=map.get(sno);
            naray[1]=i;
            break;
        }
        map.put(arr[i], i);
    }
    System.out.print("target element index is:"+naray[0]+","+naray[1]);
    }
    
}
