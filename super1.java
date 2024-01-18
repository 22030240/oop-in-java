public class super1 {
    public static void main(String[] args) {
       horse h=new horse(); 
       System.out.println(h.dh);
    }
    
}
class Animal{
    
    String dh;
    Animal(){
        System.out.println("animal constractor is calld:");
    }
}
class horse extends Animal{
    
    horse(){
        super.dh="akjx";
        System.out.println("horse constractor is called:");
    }
}
