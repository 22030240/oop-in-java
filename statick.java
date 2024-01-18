public class statick {
    public static void main(String[] args) {
        name n=new name();
        n.color();
        n.n="ganesh";
        System.out.println(n.n);
        n.rollnum=23;
        System.out.println(n.rollnum);
        n.password="34242";
        name e=new name();
        System.out.println(e.password);

    }
    
}
class name{
    String n;
    int rollnum;
    static String password; 
    
    void color(){
        System.out.println("color is.....");
    }
}