// Delete first node

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

    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(11);

        // connect
        list.head.next = second;
        second.next = third;

        list.display();
        System.out.println();
        System.out.println("The deleted element is: " +list.deleteFirst().data);
        list.display();
    }
}
