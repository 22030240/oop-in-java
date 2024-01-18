import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class spiral2matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix:");
        int arr[][]=new int[4][4];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        spiralmatrix(arr);
    }
    
   
public static void spiralmatrix(int arr[][]) {
    int startrow=0;
    int lastrow=arr.length-1;
    int startcol=0;
    int lastcol=arr[0].length-1;

    while(startrow<=lastrow && startcol<=lastcol){
       //top 
       for(int j=0;j<=lastcol;j++){
        System.out.print(arr[startrow][j]+" ");
       }
       //right
       for(int i=startrow+1;i<=lastrow;i++){
        System.out.print(arr[i][lastcol]+" ");
       }
       //bottem
       for(int j=lastrow;j<=lastcol-1;j++){
        System.out.print(arr[lastrow][j]+" ");
       }
       //left
       for(int i=lastrow-1;i<=startrow+1;i++){
        System.out.print(arr[i][startcol]+" ");
       }
       startrow++;
       lastrow--;
       startcol++;
       lastcol--;
    }
    
}
}
    

