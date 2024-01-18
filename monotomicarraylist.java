import java.util.ArrayList;

public class monotomicarraylist {
    public static void monomic(ArrayList<Integer> list) {
        for(int i=0 ;i<list.size()-1;i++){
            if(list.get(i) < list.get(i+1)){
                System.out.println("This is manotomic increses :");
                
            }
            else{
                System.out.println("This is manotomic decreses :");
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        monomic(list);

    }
    
}
