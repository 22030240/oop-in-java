class Publisher{
    String pub_name;
    Publisher(String pub_name){
        this.pub_name=pub_name;
    }
    void display(){
        System.out.println(" the publisher name is:"+this.pub_name);
    }
}
class Book extends Publisher{
    String bo_name;
    String title;
    float price;
    Book(String bo_name,String title,float price,String pub_name){
        super(pub_name);
        this.bo_name=bo_name;
        this.title=title;
        this.price=price;
 }
 void display(){
    super.display();
    System.out.println("The book name is:"+this.bo_name);
    System.out.println("The title nameis:"+this.title);
    System.out.println("price is :"+this.price);
 }
}
public class Driver {
    public static void main(String[] args) {
        Book obj=new Book ("java","java is object oriented language",123.56f,"tejas");
        obj.display();
    }
    
}
