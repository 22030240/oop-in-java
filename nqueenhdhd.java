import java.util.Scanner;

public class nqueenhdhd {
    public static void nQueen(char board[][], int row) {
        //base
        if(row == board.length){
            printboard(board);
            return;
        }
        //recursion
        for(int k=0;k<board.length;k++){
            if(issafe(board, row,k)){
                board[row][k] = 'Q';
                nQueen(board, row+1);
                board[row][k] = 'X';
            }
        }
    }
    public static boolean issafe(char board[][] , int row , int col) {
        //vertical
        for(int i=row-1 ; i>=0 ;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonaly left
        for(int i=row-1 , j=col-1; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }  
        }
        //diagonaly right
        for(int i=row-1 , j=col+1 ; i>=0 && j< board.length ; i-- ,j++){
            if(board[i][j] == 'Q'){
                return false;
            }  
        }
        return true;
    }
    public static void printboard(char board[][]) {
        System.out.println("......................Chess board............................");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the chess bord height and width:");
        int n=sc.nextInt();
        char board[][] = new char[n][n];
        // simple representation of chess board.
        for(int i=0;i < board.length;i++){
            for(int j=0;j < board.length;j++){
                board[i][j]='X';
        
            }
            System.out.println();
        }
        nQueen(board, 0);
    }
    
}
