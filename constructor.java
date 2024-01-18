public class constructor {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("Akshay");
        Student s2=new Student(29);
        Student s3=new Student("Akshay", 136);
    }
    
}
class Student{
    String name;
    int rollnum;
    Student(){
        System.out.println("Constuctor having same name:");
    }
    Student(String name){
        System.out.println(this.name=name);
    }
    Student(int rollnum){
        System.out.println(this.rollnum=rollnum);
    }
    Student(String name,int rollnum){
        System.out.println(this.name=name);
        System.out.println(this.rollnum=rollnum);
    }
}
