public class practical3 {
    public static void main(String[] args) {
        int a,b,i,c;
        a=0;
        b=1;
        i=1;
System.out.println(a+" "+b);
while(i<10){
    c=a+b;
    a=b;
    b=c;
    System.out.println(c);
    i++;
}
        

    }
}
