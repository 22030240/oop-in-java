import org.w3c.dom.css.Counter;

public class hollowrectangle {
    public static void hollowrectangl(int totalrow,int totalcol){
        // total rows
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcol;j++){
                if(i==1||i==totalrow||j==1||j==totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void invertatetrangle(int n){
        // rows
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        
            System.out.println();
        }
    }
    public static void invertatehalftranglewithnum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
    public static void floyts_triangle(int n){
        int Counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Counter);
                Counter++;

            }
            System.out.println();
        }
    }
    public static void zeronetriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //for first half
    for(int i=1;i<=n;i++){
        //star
        for(int j=1;j<=i;j++){
            System.out.print("@");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=i;j++){
            System.out.print("@");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }

    }
    public static void rombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        //hollowrectangl(4, 5);
        //invertatetrangle(4);
        //invertatehalftranglewithnum(5);
        //floyts_triangle(5);
       // zeronetriangle(5);
      // butterfly(4);
      //rombus(6);
      //hollowrombus(5);
      diamond(5);
    }
    
}
