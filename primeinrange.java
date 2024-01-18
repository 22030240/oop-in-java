public class primeinrange {
    public static void primenum(int num){
        
        if(num==2){
            System.out.println("2 is always a prime no:"+num);
        }
        for(int i=2;i<=num-1;i++){
            return false;
        }
        return true;
    
    }
    public static void main(String[] args) {
        System.out.println(primenum(3));

        
    }
    
}
