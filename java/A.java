public class A
{
    public static void main(String[] args) {
    int n=6;
    long facto=fact(n);
    System.out.println("Factorial is" +n+"="+facto);
    
    }
    
    
    public  static long fact(int n)
    {
        if(n>=1){
          return  n*fact(n-1);
           
        }
        else{
            return 1;
        }
        
        
    }
    
}