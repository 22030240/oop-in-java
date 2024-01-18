import java.util.ArrayList;
import java.util.Scanner;

public class findpair2reducecomplexity {
    public static boolean pair1(Arraylist <Integer> list , int target ) {
        int lp=0;
        int up=list.size()-1;

        while(lp != up){
            //kaam
            if((list.get(lp)+list.get(up))==target){
                return true;
            }
            //updation
            if((list.get(lp)+list.get(up)) > target){
                up--;
            }
            else{
                lp++;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element in assending order.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println("Enter target value:->");
        System.out.println(pair1(list, target));
    }
    
}
