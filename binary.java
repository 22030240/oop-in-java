import java.util.*;

public class binary {
    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparing
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
       
        return -1;

        
    }
    public static void revercearray(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=numbers[last];
            first++;
            last--;
        }
        
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28};
       // Scanner sc=new Scanner(System.in);
        //System.out.print("Enter element we want to search:");
        //int key=sc.nextInt();
        //System.out.println("Element is found at index:"+binarysearch(numbers, key));
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=numbers[last];
            first++;
            last--;
    }
    
}
    
}
