import java.util.Scanner;

public class transposematr {
    public static void main(String[] args) {
        int row=2;
        int col=3;
        int matrix[][]=new int [row][col];
        Scanner sc=new Scanner(System.in);
        //enter matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // print matrix[][]
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int transpose[][]=new int [col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
           
        }
        System.out.println("Transpose matrix is:");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
