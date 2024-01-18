public class checkqueen {
    public static void nQueen(char board[][], int row) {
        //base
        if(row==board.length){
printbord(board);
return;
}
// recursion
for(int k=0;k<board.length;k++){
if(issafe(board,row,k)){
    board[row][k] = 'Q';
nQueen(board, row+1);
board[row][k] = 'x';
}

}
}
public static boolean issafe(char board[][] , int row , int col) {
        // vertical
for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
        return false;
    }
}
  // diagonali left
  for(int i=row-1 , j=col-1;i>=0 && j>=0; i--,j--){
    if(board[i][j]=='Q'){
        return false;
    }
  }
//diagonalyb right
for(int i=row-1 ,j=col+1 ; i>=0 && j<board.length;i--,j++){
    if(board[i][j] == 'Q'){
        return false;
    }
}
return true;
    }
    
    public static void printbord(char board[][]) {
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
    }
    System.out.println();
}
        
    }
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            board[i][j]='x';
            }
            
        }
        
nQueen(board, 0);  

    }
    

}
