public class tilingproblem {
    public static int title(int n){//n for length of style
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //verticle
        int fnm1=title(n-1);
        //horizontal
        int fnm2=title(n-2);
        //tatal wayes
        int totalways=fnm1+fnm2;
        return totalways;


    }
    public static void main(String[] args) {
        System.out.println(title(10));
        
    }
    
}
