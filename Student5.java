public class Student5 {
    int rno;
    String name;
    void dispay(){
        
        System.out.println("Name :"+ name);
        System.out.println("Roll No:"+rno);


    }
    void dispay(int n,String s){
        rno=n;
        name=s;
        System.out.println("Name :"+ name);
        System.out.println("Roll No:"+rno);

        

    }
    public static void main(String[] args) {
        Student r= new Student();
        r.name=" AKshay";
        r.rno=21;
        r display();
        r dispay(11,"ABC");

        
    }
    
}
