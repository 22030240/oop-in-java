public class bintodec {
    public static void bintodecnum(int num){
        int dec=0;
        int pow=0;
        while(num>0){
            int last_degit=num%10;
            dec=dec+last_degit *(int)Math.pow(2, pow);
            pow++;
            num/=10;
        }
        System.out.print("dec no:"+dec);
    }
    public static void dectobin(int num){
        int bin_num=0;
        int pow=0;
        while(num>0){
            int last_d=num%2;
            bin_num=bin_num+last_d*(int)Math.pow(10, pow);
            pow++;
            num/=2;
        }
        System.out.print("binary no:->"+bin_num);
    }
    public static void getithposition(int num,int i){
        int bitwise=(1<<i);
        if((num & bitwise)==0){
            System.out.println("ith position is 0");
        }
        else{
            System.out.println("Ith position is 1");
        }
    }
    public static void main(String[] args) {
        bintodecnum(101);
        dectobin(2);
        System.out.println();
        getithposition(15, 1);

    }
    
}
