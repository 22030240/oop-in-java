public class Oop {
    public static void main(String[] args) {
        Pen p = new Pen();// create pen object 
        p.changename("blue pen");
        System.out.println(p.nameofpen);
        p.settip(45);
        System.out.println(p.tip);
        p.changename("black pen");
        System.out.println(p.nameofpen);
        p.tip=23;
        System.out.println(p.tip);

    }
    
}
class Pen{
    String nameofpen;
    int tip;
    
    void changename(String newcolor){
        nameofpen = newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }


}
