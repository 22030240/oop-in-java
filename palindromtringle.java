public class palindromtringle {
    public static void main(String[] args) {
        int n=12;
        //outer loop
        for(int i=0;i<n;i++){
            //spaces for inner loop
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            // values for inner loop desending order
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // values for asending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
System.out.println();
        }
    }
    
}
