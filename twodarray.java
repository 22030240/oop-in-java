import java.util.Scanner;

public class twodarray {
    public static void SearchArray(int matrix[][],int key,int n,int m){
        System.out.println("Enter element u want to search at index :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.print("Element is found at index:"+"("+i+","+j+")");
                }
            }
        }
        System.out.println();
        
    }
    public static void largestelement(int matrix[][],int n,int m){
        System.out.println("Find out largrst element in a given 2D matrx:");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max=Math.max(max, matrix[i][j]);    

            }
        }
        System.out.println();
        System.out.print("largest element of array is:"+max);
    }
    public static void minimumelement(int matrix[][],int n,int m){
        System.out.println();
        System.out.println("Find out the smallest element in a given 2D matrix:");
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                min=Math.min(min, matrix[i][j]); 
                   

            }
        }
        System.out.println();
        System.out.println("Smallest element in a given matrix is :"+min);

    }
    /*public static void sumoftwomatrix(int matrx[][],int matrix1[][],int n,int m,int x,int y){
        int matrix3[][]=new int [4][4];
        int l=matrix3.length;
        int k=matrix3[0].length;
        System.out.println("SUM OF TWO MATRIX IS:");
        for(int i=0;i<l;i++){
            for(int j=0;j<k;i++){
                matrix3[i][j]=matrx[i][j]+matrix1[i][j];

                System.out.print(matrix3[i][j]);
            }
        }
        
    */ }
    
    public static void main(String[] args) {
        int matrix[][]=new int [4][4];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("Enter 1.Matrix element into array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("array element of 1.matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int matrix1[][]=new int [4][4];
        int x=matrix.length;
        int y=matrix[0].length;
        System.out.println("Enter 2.Matrix element into array:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("array element of 2.matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter element u want to search at index :");
        int key=sc.nextInt();
        SearchArray(matrix, key, n, m);
        largestelement(matrix, n, m);
        minimumelement(matrix, n, m);
        //sumoftwomatrix(matrix, matrix1, n, m, x, key);

    }
    
}
