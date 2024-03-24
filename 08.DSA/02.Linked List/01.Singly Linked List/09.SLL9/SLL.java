// Delete a node from a singly linked list at a given position

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

    public ListNode deletePosition(int position){
        // 1->2->3->n
        ListNode current;
        ListNode temp;
        if(position == 1){
            temp = head;
            head = head.next;
            return temp;
        }else {
            int count = 1;
            ListNode previous = head;
            while(count < position - 1){
                previous = previous.next; 
                count++;
            }
            current = previous.next;
            previous.next = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(21);

        // connect
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.display();
        System.out.println();
        System.out.println("The deleted element is: " +list.deletePosition(2).data);
        list.display();
       
    }
}

