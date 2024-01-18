import java.util.LinkedList;

public class linklistaddfrist {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size;
    //add last
    public static void addlast(int data) {
        Node newnode =new Node(data);
         
        if(head == null){
            head = tail = newnode;
        }
        //step 2
        tail.next = newnode;
        tail= newnode;

    }
        
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
public  void printlk() {
    //base case
    if(head == null){
        System.out.println("Linklist is empty:->");
    }
    Node temp = head;
    while(temp !=  null){
        System.out.print(temp.data+ " -> ");
        temp =temp.next;
    }
    System.out.println();
}  
public static void add(int idx , int data) {

    Node newnode = new Node(data);
 
    Node temp=head;
    int i=0;
    while(i < idx){
        temp=temp.next;
        i++;
    }
    newnode.next =temp.next;
    temp.next=newnode;
    
}
public static int removefrist(){
    
    if(head == null){
        System.out.println("ll is empty:");
    }
    int val = head.data;
    head = head.next;
    return val;
   
}
public static int removelast() {
    if(head == null){
        System.out.println("ll is empty");
    }
    Node prev = head;
    for(int i=0;i<5-2;i++){
        prev = prev.next;
    }
    
    int val= prev.next.data;
    prev.next = null; 
    tail = prev;
    return val;
}
public static int itrsearch(int key){
    Node temp = head;
    int i = 0;
    while(temp != null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
        
    }
    return -1;
}
public static  int helper( Node head , int key){
   if(head == null){
    return -1;
   }
    if(head.data == key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx == -1){
       return -1;
    }
    return idx+1;
}
public  static int recursivesearch(int key) {
    return helper(head, key);
    
}

public Node findmid(Node head ){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; // as a mid

}
public boolean checkpalindrome(){
    //base
    if(head == null && head.next != null){// empty list or any one element is also palindrome
        return true;
    }
    Node midnode= findmid(head);

    // reverse the mid
    Node prev = null;
    Node curr = midnode;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;// right half head
    Node left= head;
    // check the right is equal to left
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        // updation in while loop
        left = left.next;
        right= right.next;
    }
    return false;
}
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
//     ll.addFirst(13);
//     ll.addFirst(2);
//     ll.addLast(3);
//     ll.addFirst(5);
//     ll.add(2,4);
//     System.out.println(recursivesearch(13));
//     ll.add(5, 44);
//     ll.addLast(7);
//    // System.out.println( itrsearch(2));
//     System.out.println();
//     System.out.println(ll);
//     ll.removeFirst();
//     System.out.println(ll);
//     ll.removeLast();
//     System.out.println(ll);
//     System.out.println(recursivesearch(13));
//     System.out.println(ll.size());
 
   // System.out.println( itrsearch(44));
   ll.addFirst(1);
   ll.addLast(2);
   ll.addLast(3);
   ll.addLast(2);
   ll.addLast(1);
   ll.printlk();
   System.out.println(ll);
   System.out.println(ll.checkpalindrome());
    
}

}
    

