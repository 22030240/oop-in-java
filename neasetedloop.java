

public class neasetedloop {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1;i<=4;i++){ // outer for loop 
            for(int j=1;j<=4-i+1;j++){ // 4-i+1  
                System.out.print("*");
            }
            System.out.println();
        }


        for(int lenght=1;lenght<=4;lenght++){
            for(int num=1;num<=lenght;num++){
                System.out.print(num);
            }
            System.out.println();
        }

        for(int lan=5;lan<=8;lan++){
            for(int nu=5;nu<=8-lan+1;nu++){
                System.out.print(nu);
            }
            System.out.println();
        }
 char c='A';
        for(int n=1;n<=4;n++){
            for(int ch=1;ch<=n;ch++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    for(int ii=1;ii<=4;ii++){
        for(int jj=1;jj<=4-ii+1;jj++){
            System.out.print(c);
            c++;
        }
        System.out.println();
    }
    }
    
}
