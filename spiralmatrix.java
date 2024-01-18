import java.util.Scanner;

// spiral matrix is representation of in the form of spiral.

public class spiralmatrix {
    public static void spiralmatrix(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow&&startcol<=endcol){
            //top
            for(int j=0;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;i++){
                if(i==j){
                    sum+=matrix[i][j];
                    
                }
              else if(i+j==matrix.length-1){
                     sum+=matrix[i][j];
                }
                
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]=new int [4][4];
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter element in matrix[3][3]:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Element are:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      //  spiralmatrix(matrix);
      System.out.println(diagonalsum(matrix));
      
     


    }
    
}
