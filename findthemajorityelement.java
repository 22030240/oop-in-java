public class findthemajorityelement {// o(n^2)
    public static int majorityelement(int arr[],int count) {
        int majorcount=arr.length/2;  // calculate the index mid.
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count +=1;
                }
               
            }
            System.out.println("mority element in array are this time->"+count);
            
            if(count > majorcount){
                return arr[i];
            }
            
        }
        return -1;
        
        
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,5,3,2,4};
        System.out.println("majority element is->"+majorityelement(arr,0));
    }
    
}
