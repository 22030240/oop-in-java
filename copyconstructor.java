public class copyconstructor {
    public static void main(String[] args) {
        Student s1=new Student();
       s1.name="Akshay";
       s1.rollnum=32;
       s1.password="abcd";
       s1.mark[0]=23;
       s1.mark[1]=34;
       
       Student s2=new Student( s1);
        s1.name="ajay";
        System.out.println(s1.name);
        s1.mark[0]=78;
        for(int i=0;i<2;i++){
            System.out.println(s2.mark[i]);
        }
        

       

    }
    
}
class Student{
    String name;
    int rollnum;
    String password;
    int mark[];

    Student(){
        mark=new int[2];
        System.out.println("condtructor does not have return type:");
    }
    Student(String name){
        mark=new int[2];
System.out.println(this.name=name);
    }
    //shallow copy
    // Student(Student s1){
    //     mark=new int[2];
    //     System.out.println(this.mark=s1.mark);
    //     System.out.println(this.name=s1.name);
    //     System.out.println(this.rollnum=s1.rollnum);
    // this.mark=s1.mark;
    // }
    // deep copy
    Student(Student s1){
        System.out.println(this.name=s1.name);
        mark=new int [2];
        for(int i=0;i<mark.length;i++){
            this.mark=s1.mark;
        }
    }
}
