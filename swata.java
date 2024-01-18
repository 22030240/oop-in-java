import javax.print.DocFlavor.STRING;

public class swata {
    public static String[] mergesort(String[] arr, int lo, int hi) {
       //base
       if(lo==hi){
        String []A={ arr[lo] };
       } 
       return A;

       //kaam
       int mid=lo + (hi-lo)/2;
       //left partition
       mergesort(arr,lo,mid);
       //right partition
       mergesort(arr, mid, hi)
    }
    public static void main(String[] args) {
        String []arr={"Apple","zebra","cat","elephant","mango"};
        String [] a=mergesort(arr,0,arr.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
