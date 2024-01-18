import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("genter of user is:");
        String g=sc.nextLine();
        System.out.println("age of user :");
        int age=sc.nextInt();
        System.out.println("enter education of "+name+" is :");
        String ed=sc.nextLine();
        if(g=="mail"){
            if(age>21){
                System.out.println(name+" eligible for marraige ");
            }
            else{
                System.out.println(name+" kya sakt londa hai bhai hoin n bhau lagn 21 cha t hoy ");
            }
        }
        else{
            if(age>18){
                System.out.println(name+" eligible for marraige ");
            }
            else{
                System.out.println("lovkar kara ho ecch lagn ");
            }
        }
        
        if(ed=="engineer"||ed=="doctor"||ed=="above 10 acre shet"||ed=="ca"||ed=="succesful job"){
            System.out.println(name+"changla batin ");
        }
        else{
            System.out.println(name+" baki kahi condition paha lagtin");
        }

        
        
    }
    
}
