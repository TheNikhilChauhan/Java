// Delete last node of a Singly Linked List 

public class SLL {
    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;

        // constructor
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

    /* public ListNode deleteLast(){
        ListNode deleted;
        // 1->2->3->n
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        while(current.next.next != null){
            current = current.next;
        }
        deleted = current.next;
        current.next = null;
        return deleted;

    } */

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
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

        l.display();
        System.out.println();
        System.out.print(l.deleteLast().data);
        System.out.println();
        l.display();
    }
}

