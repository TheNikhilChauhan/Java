// Insert nodes at a given position in Singly Linked List

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

    public void insert(int position, int value){
        ListNode newNode = new ListNode(value);

        if(position == 1){
            newNode.next = head;
            head = newNode;
        } else{
            int count = 1;
            ListNode previous = head;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
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

        l.insert(3, 55);
        l.insert(1, 100);
        l.display();
    }
}

