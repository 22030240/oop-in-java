public class findtargetrange {
    public static void main(String[] args) {
       int arr[]={1,2,2,2,3,4,5,6,7,7,7,7,7,7,7,7,9};
       targetrange(arr, 7); 
    }
    public static void targetrange(int arr[],int target) {
        int left=0,right=arr.length-1;
        int first=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
             first=mid;
             right=mid-1;
            }
            else if(arr[mid]>target){
              right=mid-1;
            }
            else{
             left=mid+1;
            }
        }
        System.out.println(first); 
        left=0;
        right=arr.length-1;
        int last=-1;
        while(left <= right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
               last=mid;
               left=mid-1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        } 
        System.out.println(last);     
    }
    
}
