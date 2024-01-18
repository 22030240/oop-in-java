public class Member {
    String name;
    int age;
    String number;
    String address;
    int salary;



    public void printSalary(){
        System.out.println(salary);
    }
    
} class Employee extends Member{
    String specialization ;
}
class Manager extends Member{
    String department;
}
class Ans{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name=" xyz";
        e.age= 23;
        e.number="9356399176";
        e.address="Xyzxyz";
        e.salary=1231;
        e.specialization="xyzxyz";
        Manager x = new Manager();
        x.name=" xyz";
        x.age= 23;
        x.number="9356399176";
        x.address="Xyzxyz";
        x.salary=1231;
        x.department="hjhdfjhj";


    }
}
