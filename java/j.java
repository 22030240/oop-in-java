public class j {
    public class Node{
     int data;
     Node next;
     Node prev;
     public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
     }
    }
    public static Node head;
    public static Node tail;
    public static Node size;

public void addfirst(int data){
    Node newnode = new Node(data);
   size++;
    if(head==null){
        head=tail=newnode;
        return ;
     }
     newnode.next=head;
     head.prev=newnode;
     head = newnode;

}
public void addlast(int data) {
    Node newnode = new Node(data);
    size++;
    if(head==null){
        head=tail=null;
        return;
    }
    
    
}


    
}
