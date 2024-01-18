public class rotateandsearch {
    public static int search(int arr[] , int target , int si , int ei) {
           // base
           if(si > ei ){
            return -1;
           }
        //kaam
        int mid= si + (ei-si)/2;//si+ei/2
        
        // if element is directly prasent in mid
        if(arr[mid] == target){
            return mid;
        }

        //LINE 1.
        if(arr[si] <= arr[mid]){
      // case 1.->-> left
      if(arr[si] <= target && target <= arr[mid]){
        return search(arr, target, si, mid-1);
      }
      // case 2->-> if element is not present l1 left so find element at right on line l1.
      else{
       return  search(arr, target, mid+1, ei);
      }
    }
        //mid on L2
        else{
            //case 3.->-> element lie on l2 right 
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                // case 4->-> element lie on l2 left
                return search(arr, target, si, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=2;
        int tar=search(arr, target, 0, arr.length-1);
        System.out.println(tar);

    }
    
}
