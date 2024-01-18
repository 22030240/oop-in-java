import java.util.Scanner;

public class convertrotate90 {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element in matrix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("entered matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        rotateby90(arr);
        print(arr);
    }
    public static void rotateby90(int arr[][]) {
        // step no.1->transpose the matrix 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // step no.2->swap the column
        int left=0,right=arr[0].length-1;
        while(left>right){
            for(int i=0;i<arr[0].length;i++){
            int temp=arr[i][left];
            arr[i][left]=arr[i][right];
            arr[i][right]=temp;
        }
        left++;
        right--;
    }
       
    }
    public static void print(int arr[][]) {
       for(int []a:arr){
        for(int val:a){
            System.out.print(val+" ");
        }
        System.out.println();
       }
        
    }
    
}
