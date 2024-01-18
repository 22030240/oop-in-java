import java.util.LinkedList;



public class mergesortproblem {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
    while(fast != null && fast.next != null){
        slow =slow.next;
        fast =fast.next.next;
    }
    return slow;// slow is my mid
    }
    public Node merge(Node head1 , Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;
        while(head1 != null && head2 != null ){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            //for remaining element
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            // right
            while( head2 != null ){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        return mergell.next;
    }
    public Node mergesort(Node head) {
        //base case
        if(head==null || head.next == null){
            return head;
        }
        // kaam
        Node mid = getmid(head);

        // create righthead
        Node rightheaNode = mid.next;
        mid.next = null;

        Node newleft =mergesort(head);
        Node newright = mergesort(head);

        return merge(newleft , newright);
        
    }
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.addFirst(4);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(34);
        list.addLast(40);
        list.addFirst(21);
        System.out.println(list);
        list.head = list.mergesort(list.head);
        System.out.println(list);
    }
}
