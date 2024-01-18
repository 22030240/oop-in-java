public class optimizesolutionofincount {
    public static int devideintwoarray(int arr[],int left , int mid , int right) {
        int incount = 0;
        int k=0;
        int temp[]= new int[right-left+1];
        while(left < mid && right >= mid){
            if(arr[left] <= arr[mid]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                incount += (mid - left);
                right++;
            }
            k++;
        }
        //remaining any element.
        while(left < mid){
            temp[k]=arr[left];
            k++;
            left++;

        }
        while(right > mid){
            temp[k]=arr[right];
            right++;
            k++;
        }
        int i;
        for( i=left, k = 0 ;i<=right;i++,k++){
            arr[i]=temp[k];

        }
        return incount;
    }
    public static int  mergesort(int arr[] , int left , int right){
        int incount=0;
    //base 
    if(right==left){
        return left;
    }
    //kaam
    if(right > left){
        int mid =(left+right)/2;
        incount= mergesort(arr, left, mid);
        incount += mergesort(arr, mid+1, right);
        incount += devideintwoarray(arr, left, mid, right);

    }
    return incount;
    } 
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        System.out.println("inversion count :->"+mergesort(arr, 0, arr.length-1));
    }
    
}
