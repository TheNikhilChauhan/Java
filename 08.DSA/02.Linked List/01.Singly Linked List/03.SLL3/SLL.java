// Find length of a Singly Linked List

public class SLL {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        // constructor
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public int CountLength(){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SLL l = new SLL();
        l.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connect
        l.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("The Length of Linked List is: " + l.CountLength());
    }
}
