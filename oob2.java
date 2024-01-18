class Employee{
    int saliry;
    String name;
    public int getsaliry(){
        return saliry;

    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name =n;
    }
}






public class oob2 {
    public static void main(String[] args) {
        //problem 1
        Employee Akshay=new Employee();
        Akshay.setname(" my name is rohit ");
        Akshay.saliry=546;
        System.out.println(Akshay.getname());
        System.out.println(Akshay.getsaliry());
        
    }
    
}
