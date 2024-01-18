import java.util.LinkedList;

public class searchinlinklist {
    class Node{
        int data;
        node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
            
        }
    }
    public static Node  head;
    public static Node tail;
    
    public static void addfrist(int data) {
        // create no
        Node newnode = new Node(data);
        
        if(head == null){
            head = tail = newnode;
        }
        //step 2. newnode ka next =head
        newnode.next=head;
        //step 3. head = newnode
           head = newnode;
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        ll.addFirst(12);
        ll.addFirst(23);
        System.out.println(ll);
    }
    
}
