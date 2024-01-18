import java.util.Scanner;

public class searchelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[4][4];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter kay we want search:");
        int key=sc.nextInt();
        int row=0;int col=matrix.length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.print("Element is found at:"+"("+row+","+col+")");
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
           row++;
           col--;
         }

    }
    
}
