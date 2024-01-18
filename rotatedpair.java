import java.util.ArrayList;

public class rotatedpair {
    public static boolean pair( ArrayList<Integer> list , int targert) {
        int bp =-1;

        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp= i;
                break;
            } 
        }
        int lp = bp+1;
        int up = bp;
        while(lp != up){
            //kaam
            if((list.get(lp)+list.get(up))== targert){
                return true;
            }
            //updation
            if((list.get(lp)+list.get(up)) < targert){
                lp=(lp+1)% n;
            }
            else{
                up=(up+n-1)% n;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int targert=4;
        System.out.println(pair(list, targert));
    }
    
}
