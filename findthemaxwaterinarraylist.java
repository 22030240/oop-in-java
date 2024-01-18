import java.util.ArrayList;

public class findthemaxwaterinarraylist { //o(n^2)
    // public static int maxwater(ArrayList<Integer> height) {
    //     int maxwater=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht=Math.min(height.get(i), height.get(j));
    //             int wt=j-i;
    //             int currwaterarea=ht*wt;
    //             maxwater=Math.max(maxwater, currwaterarea);
    //         }
    //     }
    //     System.out.println("Max water store:->");
    //     return maxwater;
    // }
    public static int maxwater(ArrayList<Integer> height) {
     // this is two point approch methode
     int lp=0;
     int up=height.size()-1;
     int maxwater =0;
     while(lp < up){
    int ht=Math.min(height.get(lp), height.get(up));
    int width=up-lp;
    int current=ht*width;
    maxwater=Math.max(maxwater,current);
    //updation
    if(height.get(lp)< height.get(up)){
        lp++;
    }
    else{
        up--;
    }
     }
     return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxwater(height));
    }
    
}
