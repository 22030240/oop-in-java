import java.util.Scanner;

public class morchsortoperation {
    // for print the array.
    public static void print(int arr[]) {
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       } 
       System.out.println();
    }
    public static void morchsort(int arr[],int si,int ei) {
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+ei-si/2; // si+(si/2-ei/2) ->->->   (si-ei)/2
        //for left
        morchsort(arr, si, mid);
        //for right
        morchsort(arr, mid+1, ei);
        //for morch
        mearch(arr,si,mid,ei);
    }
    public static void mearch(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];//  assume n=arr.length  ->-> ei=n-1 si=0  [n-1-0]+1= n
        int i=si;// for left
        int j=mid+1; // for right
        int k=0; // for temp
        while(i<=mid && j<=ei){
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
                
                i++;
            }
            else{
                temp[k]=arr[j];
                
                j++;
            }
            k++;
        }  
        // for any remaining 
        // left
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=ei){
            temp[k++]=arr[i++];
        }

        // convert temperary array to original array
        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        
        int arr[]={2,5,3,7,5,6,9,1};
        
        
        morchsort(arr, 0, arr.length-1);
        print(arr);
    }
    
}
