// Find nth node from the end

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

   
    public ListNode findNFromLast(int n){
        ListNode node1 = head;
        ListNode node2 = head;
        int count = 0;
        while(count < n){
            node1 = node1.next;
            count++;
        }
        while(node1 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        System.out.println(node2.data);
        return node2;
    }

   
    public static void main(String[] args) {
        SLL list = new SLL();
        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(21);
 
        // connect
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        list.display();
        System.out.println();
        list.findNFromLast(3);
        

    }
}

