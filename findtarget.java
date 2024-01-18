import java.util.Arrays;
import java.util.Scanner;

public class findtarget {
    public static void solution(int a[], int target,int n){
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==0||a[i]!=a[i-1]){
             int j=i+1,k=n-1;
             int tar=target-a[i];
             while(j<k){
               if( a[j]+a[k]==tar){
                System.out.println(a[i]+","+a[j]+","+a[k]);
                // repeted value
                while(j<k && a[j]==a[j+1])j++;
                while(j<k && a[k]==a[k-1])k--;
                j++;
                i++;
               }
               else if(a[j]+a[k]<tar){
                j++;
               }
               else{
                k--;
               }

             }
            }
}
    }
    public static void main(String[] args) {
        int a[]={1,-1,2,-2,4,5,3,7,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your targert:");
        int target=sc.nextInt();
        solution(a,target,a.length);
    }
    
}
