public class Emse2 {
    public static void main(String[] args) throws OutOfRangeException{
        try{
            int a;
            if(a<0||a>50){
                throw new OutOfRangeException("Valid range is 10 to 50");{
                    int s=a*a;
                    System.out.println("Squre is "+s);

                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
