import java.util.*;
public class findlargeandsmall {
    public static int largest(int value[]){
        int largest=Integer.MIN_VALUE;
for(int i=0;i<value.length;i++){
    if(largest<value[i]){  //o(n)
        largest=value[i];
    }
}
return largest;
        
    }
public static int smallest(int value[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<value.length;i++){
        if(smallest>value[i]){
            smallest=value[i];
        }
    }
    return smallest;
}
    public static void main(String[] args) {
        int value[]={12,686,849,4488,30,55788,3947,588,469,4886};
        System.out.println("Largest element is:"+largest(value));
        System.out.println("Smallest element is:"+smallest(value));
    }
    
}
