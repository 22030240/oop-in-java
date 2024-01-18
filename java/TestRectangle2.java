
class Rectangle {
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
    }
    void calculatearea(){
        System.out.println(length*width);
    }
}




public class TestRectangle2 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        final Rectangle r2=new Rectangle();
        r1.insert(10, 5);
        r2.insert(4, 15);
        r1.calculatearea();
        r2.calculatearea();
        
    }
    
    
}
