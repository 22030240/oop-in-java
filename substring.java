public class substring {
    public static int  countsub(String str , int i , int j , int n) {
        //base case
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        //kaam
        int res=countsub(str, i+1, j, n-1)+countsub(str, i, j-1, n-1)+countsub(str, i+1, j-1, n-2);
        return res;

 }
    public static void main(String[] args) {
        String str="abcab";
        int n=str.length();
        System.out.println(countsub(str, 0, n-1, n));
    }
    
}
