public class pearoffriends {
    public static int pearfriend(int n){
        //base
        if(n == 1||n == 2){
            return n;
        }
        //kaam
        //single
        int fnm1=pearfriend(n-1);
       // System.out.println(fnm1);
        //pear
        int fnm2=pearfriend(n-2);
        int pearwayes=(n-1)*fnm2;

        //total wayes
        int total=fnm1+pearwayes;
        return total;
    }
    public static void main(String[] args) {
    System.out.println("total wayes="+pearfriend(6));
    }
    
}
