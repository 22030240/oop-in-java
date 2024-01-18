public class incount {// time complexcity->o(n^2)
    public static int  getincount(int arr[]) {
        int incount=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    incount +=1;
                }
            }
        }
        return incount;
        
    }
    public static void main(String[] args) {
        int arr[]={1, 20, 6, 4, 5,2};
        System.out.println("inversion count is->"+getincount(arr));
    }

    
}
