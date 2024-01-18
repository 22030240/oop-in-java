public class quicksort {
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
System.out.println();
        
    }
    public static void sortelement(int arr[],int si,int ei) {
     //base case
     if(si>=ei){
        return;
     }
     // last element as a pivot.
     int pidx=partition(arr,si,ei);
     //left
     sortelement(arr, si, pidx-1);
     //right
     sortelement(arr, pidx+1, ei);
        
    }
    public static int partition(int arr[],int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;// jagah banane ke liy -1;to make place for storing elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap for making partition 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp=pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

        
    }

    public static void main(String[] args) {
        int arr[]={4,6,8,9,2,1,-2};
        sortelement(arr, 0, arr.length-1);
        printarr(arr);
    }
    
}
