import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int matrix[][]= new int [4][4];
        System.out.println("Enter element in matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Element are:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];

                }
                else if(i+j==matrix.length-1){
                   sum+=matrix[i][j];
                }
                
            }
        
        }
        System.out.println("sum is"+sum);
        
    }
    
}
