import java.util.Scanner;

public class gridwayes {
    public static int wayes(int i , int j, int row ,int col) {
        //base
        if(i==row-1 && j==col-1){//condition for last cell.
            return 1;
        }
        else if(i==row || j==col){//bpndary condition
            return 0;
        }
        //recursion
        //down
        int w1=wayes(i+1, j, row, col);
        //left
        int w2=wayes(i, j+1, row, col);
        return w1+w2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grid row and col:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("total wayes is:->"+wayes(0, 0, row, col));
    }
    
}
