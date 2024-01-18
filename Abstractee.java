

public class Abstractee {
    public static void main(String[] args) {
        Horsh h=new Horsh();
        h.eat();
        h.walk();
        Bird b=new Bird();
        b.eat();
        b.walk();
    }
}
abstract class Animal{

    Animal(){
        System.out.println("Animal having different color:");
    }
    void eat(){
    System.out.println("Eats something:");
    }
    abstract  void walk();
}
class Horsh extends Animal{
    Horsh(){
        System.out.println("Horse eat");
    }
    void walk(){
        System.out.println("horse on 4 leg");
    }
}
class Bird extends Animal{
    Bird(){
        System.out.println("bird are fly:");
    }
    void walk(){
        System.out.println("Bird on 2 leg");
    }
}
