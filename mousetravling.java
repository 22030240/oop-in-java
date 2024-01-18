public class mousetravling {
    public static void printsolution(int sol[][]) {
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(" "+ sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean issafe(int maze[][] , int x, int y) {
        return (x>= 0 && x< maze.length && y>=0 && y < maze.length && maze[x][y]==1);
        
    }
    public static boolean solvemaze( int maze[][]) {
        int n=maze.length;
        int sol[][] =new int[n][n];
        if(solvemazeut(maze, 0, 0, sol) == false){
            System.out.println("solution doesnot exit:");
            return false;
        }
        printsolution(sol);
        return false;
    }
    public static boolean solvemazeut(int maze[][] , int x, int y, int sol[][]) {
                                                    // for row  , for col , for storing values.
    if( x == maze.length-1 && y == maze.length-1  && maze[x][y]==1){
        sol[x][y] = 1; // jar maze[x][y]==1 asen tar sol[x][y]==1
        return true;
    }
    if(issafe(maze , x, y) == true){
        if(sol[x][y] == 1){
            return false;
        }
        sol[x][y] =1;
        if(solvemazeut(maze, x+1, y, sol)){
            return true;
        }
        if(solvemazeut(maze, x, y+1, sol)){
            return true;
        }
        sol[x][y] = 0;// backtracing 
        return false;
    }
    return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1, 1, 1, 1},
                       {0, 0, 1, 1},
                    {0, 1, 0, 1},
                {0, 1, 1, 1}};
                System.out.println("path of mouse traveling:->");
                solvemaze(maze);
                System.out.println("Final traveling is:->");
    }
    
}
