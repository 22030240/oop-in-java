import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class inbuildsort {
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,9,6,7,0};
       // Arrays.sort(arr);
       //Arrays.sort(arr,0,3);
      // Arrays.sort(arr,Collections.reverseOrder());
      //Arrays.sort(arr,0,3,Collection.reverseOrder());
       Arrays.sort(arr,Collection.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    
    }
    
}
