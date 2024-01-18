public class arragestringusingmorgrsort {
    public static String[] mergesort(String arr[],int lo, int hi) {
        //base 
        if(lo == hi){
            String [] A ={ arr[lo] };
            return A;
        }
        //kaam

        int mid = lo + (hi-lo)/2;// lo+hi/2
      String [] arr1 = mergesort(arr, lo, mid); // left
      String [] arr2 = mergesort(arr, mid+1, hi); // right
      String [] arr3 = merge(arr1,arr2);
      return arr3;
    }
    public static String[] merge(String[] arr1, String[] arr2 ){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String [m+n];
        int i=0 ;
        int j=0 ;
        int k=0 ;
        while(i < m && j < n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[k]= arr1[i];
                i++;
            
            }
            else{
                arr3[k] = arr2[j];
                j++;
                
            }
            k++;
        }
        // for remaining
        while(i < m){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j < n){
            arr3[k]=arr1[j];
            j++;
            k++;
        }
        return arr3;

    }
    public static boolean isAlphabeticallySmaller(String str , String str2) {
        if(str.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] arr={ "sun","earth","mara","jhj","mercury" };
        String[] a =mergesort(arr,0,arr.length-1);
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
