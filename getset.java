public class getset {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setname("Blue");
        System.out.println(p.getname());
        p.settip(34);
        System.out.println(p.gettip());
        Student sp=new Student();
        
    }
    
}
class Pen{
   private String name;
    private int tip;
   String getname(){
       return this.name;
    }
   int gettip(){
      return this.tip;
    }
    void setname(String newname ){
        name=newname;
    }
    void settip(int newtip){
tip=newtip;
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Constructor is automatically created by calling object:");
    }
}
