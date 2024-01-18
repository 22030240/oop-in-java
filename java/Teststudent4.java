class student{
    int rollno ;
    String name ;
    void insertRecord( int r,String n){
        rollno=r;
        name =n;

    }
void displayinformation(){
    System.out.println(rollno +" "+name);
}
}





public class Teststudent4 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        s1.insertRecord(111, " karan");
        s2.insertRecord(222, " ram ");
        s1.displayinformation();
        s2.displayinformation();

        
    }
    
}
