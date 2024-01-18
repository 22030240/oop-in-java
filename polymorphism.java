import javax.sound.sampled.SourceDataLine;

public class polymorphism {
    public static void main(String[] args) {
    //    Calculator cal=new Calculator();
    //    cal.sum(10, 20);
    //    cal.sum(10.5f, 20.5f);
    //    cal.sum(5, 10, 15);
//     }
// }
// class Calculator{
//     void sum(int a,int b){
//         System.out.println("Sum of a+b is:"+(a+b));
//     }
//     void sum(float a, float b){
//         System.out.println("Sum of float num a+b:"+(a+b));
//     }
//     void sum(int a, int b, int c){
//         System.out.println("Sum of a+b+c is:"+(a+b+c));
bird b=new bird();
b.eat();
     }
 }

class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class bird extends Animal {
    void eat(){
        System.out.println("Eats javari");
    }

    
}

