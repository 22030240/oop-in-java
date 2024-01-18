public class selectionsort {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,8,7,11,45,12,10,9,13,18,76,63,27};
        //outer loop
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }

            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    
    
}
