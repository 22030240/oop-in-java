import java.util.ArrayList;

public class findpairsum1 { // o(n^2)
    public static int pair1(ArrayList<Integer> list , int target){
        int countof_target=0;
        for(int i=0;i<list.size()-1; i++){
            for(int j=i+1 ; j<list.size()-1;j++){
                if((list.get(i)+list.get(j))== target){
                    countof_target ++;
                }
            }
        }
return countof_target;
        
 }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(7);

        int target= 7;
        int tar=pair1(list, target);
        if(tar > 0){
            System.out.println("Target element is present:"+tar);
        }
        else{
            System.out.println("Target element is not present:");
        }
        
    }
    
}
