// Creating Singly Linked List

public class SLL{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SSL l = new SLL();
        l.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Connect them to form a chain
        l.head.next = second;
        second.next = third;
        third.next = fourth;
        
    }
}