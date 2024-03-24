// Reverse a singly linked list

public class SLL {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void reverseDisplay(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        // 1->2->3->4->n
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        while(previous != null){
            System.out.print(previous.data + "-->");
            previous = previous.next;
        }
        System.out.print("null");
        
    }

   
    public static void main(String[] args) {
        SLL list = new SLL();
        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
 
        // connect
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.display();
        System.out.println();
        list.reverseDisplay();
        

    }
}
