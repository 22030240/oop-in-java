import java.util.Scanner;

public class searchelementinmatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                      {5,6,7,8},
                    {9,10,11,12},
                {13,14,15,16}};
      Scanner sc=new Scanner(System.in);
      int target=sc.nextInt();
      System.out.println(searchmatrix( arr, target));
    }
    public static boolean searchmatrix(int arr[][],int target ) {
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }


    
}
