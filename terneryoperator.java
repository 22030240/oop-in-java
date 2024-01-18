public class terneryoperator {
   
    public static void main(String[]arg){
        int a=10;
        int b=20;
        int c=30;
        int d=40 , result;
        result = ((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println("max of there number ="+result);

    }
    
}
