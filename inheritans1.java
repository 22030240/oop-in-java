// inheritans are use to perform 100% abstraction.

public class inheritans1 {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        king k=new king();
        k.moves();
        
    }
    
}
interface Chess{
    void moves();
}
class queen implements Chess{
    public void moves(){
        System.out.println("up,right,left,diagonal,queen");
    }
}
class king implements Chess{
    public void moves(){
        System.out.println("up,down,diagonal,right,king");

    }
}
class police implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,polish");
    }
}