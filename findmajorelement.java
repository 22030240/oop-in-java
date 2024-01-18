import java.util.Scanner;

public class findmajorelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int n =arr.length;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     System.out.println( findmajorelement(arr,n));

    }

    public static int findmajorelement(int arr[],int n) {
       int candidate=arr[0];
       int count=1;
       for(int i=1;i<n;i++){
        if(arr[i]==candidate){
            count++;
        }
        else{
            count--;
        }

        if(count==0){
            candidate=arr[i];
            count=1;
        }
       } 

       // varify your answer;
       count=0;
       for(int val:arr){
        if(val==candidate){
            count++;
         }
         }
       
       if(count >n/2){
        return candidate; 
       }
       else{
        return -1;
       }
    }
    
}
