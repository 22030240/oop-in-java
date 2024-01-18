import java.util.Scanner;

public class lastoccurance {
    public static int last(int arr[],int key,int i) {
      if(i==arr.length){
        return -1;
      } 
      int isfound=last(arr,key,i+1);
      if(isfound==-1&&arr[i]==key){
        return i;
      } 
      return isfound;
    }
    public static int first(int arr[],int key,int i) {
       if(i==arr.length){
        return -1;
       }
       
        if(arr[i]==key){
            return i;
        }
        return first(arr, key, i+1);
        
    }
    public static int power(int x,int n) {

        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
        
    }
    public static int poweroptimize(int x,int n){//o(lagn)
        if(n==0){
            return 1;
        }
        int halfpower=poweroptimize(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if(n % 2 != 0){
           halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
       // int arr[]={2,4,5,7,2,2,2,3};
       // System.out.println(first(arr, 7, 0));
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(poweroptimize(x, 11));
    }
    
}
