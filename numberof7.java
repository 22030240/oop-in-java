public class numberof7 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,7},{7,7,3}};
int count7=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==7){
                count7++;
               }
            }
        }
        System.out.print("Number of 7 is:"+count7);
    }
}
