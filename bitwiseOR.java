public class bitwiseOR {
    
        public  int sum(int a,int b){
            int sum=0;
            int i;
            for(i=a;i<=b;i++){
                if(i%2==0){
                    sum=sum+i;
                }
                else{
                    sum=0;
                }
    
            }
            System.out.println("The sum of"+a+"to"+b+" =="+sum);
    
        }
        public double sum(double n){
           double prodc=1.0;
            int i;
            for(i=1;i<=n;i+=0.2){
                prodc=prodc*i;
                System.out.println(i +"*");
            }
            System.out.println(prodc);
    
        }
        public int sum(int n){
            int sum=0;
            while(n!=0){
                int d=n%10;
                if(d%2!=0){
                    sum=sum+d;
    
                }
                n=n/10;
            }
            System.out.println(sum);
    
        }
        public static void main(String[] args) {
            bitwiseOR cv=new bitwiseOR();
           int p= cv.sum(4, 16);
            System.out.println(p);
            int q=cv.sum(123);
            System.out.println(q);
            int w=cv.sum(43961);
            System.out.println(w);
        }
    }
    

