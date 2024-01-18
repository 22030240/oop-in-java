public class Inheritans {
    public static void main(String[] args) {
      cow a=new cow();
      a.eats();
      a.breadth();
      a.swas();
      
      
      

    }
    
}
class Animal{
    String name;

    void eats(){
        System.out.println("Eats");
    }
}
class fish extends Animal{
    String color;

    void breadth(){
    System.out.println("Breadth");
    }
}
class cow extends fish{
    void swas(){
        System.out.println("hjh");
    }
}
