public class methodeoverloading {
    int rno;
    String name;
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll No :"+rno);
    }
    void display(int n,String s){
        rno=n;
        name =s;
        System.out.println("Name :"+name);
        System.out.println("Roll No :"+rno);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.display (); s.dispay (32,"ghgg");

        
    }
    
}
