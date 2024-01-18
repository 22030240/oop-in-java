import javax.sound.sampled.SourceDataLine;

public class hybridinheritance {
    public static void main(String[] args) {
        Ox o=new Ox();
        o.color();
        o.namepfox();
    }
    
}
class Animal{
    String name;
    String color;
     
    void eat(){
        System.out.println("Eats");
    }
    void color(){
        System.out.println("White black");
    }
    void namep(){
        System.out.println("names");
    }
}
class cow extends Animal{
    int legs;
  void bb(){
    System.out.println("bb");
  }
}
class Ox extends cow{
    void namepfox(){
        System.out.println("Khillari");
    }
}
class fish extends Animal{
    String wingname;
}
class shark extends fish{
    void name(){
        System.out.println("Shark");
    }
    
}
class poplet extends fish{
    String typeoffish; 
}
class bird extends Animal{
    void bird1(){
        System.out.println("peacock");
    }
}
class peacock extends bird{
    void nameofstring(){
        System.out.println("cock");
    }
}
