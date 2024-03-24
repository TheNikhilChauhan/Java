// Search an element in a Linked list 

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

    public boolean FindElement(int value) {
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == value){
                System.out.print("The element is present: " +current.data);
                return true;
            }
            current = current.next;
        }
        System.out.println("The element is not present.");
        return false;
        
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
        list.FindElement(11);
        System.out.println();
        // list.FindElement(12);

    }
}