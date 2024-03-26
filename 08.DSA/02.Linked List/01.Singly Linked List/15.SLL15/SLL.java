// Remove a key from singly linked list


public class SLL {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = next;
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
    // 2->4->6->8->n
    public ListNode removeNode(int value){
        ListNode current = head;
        ListNode newNode = new ListNode(value);
        ListNode temp = null;
        while(current != null && current.data != newNode.data){
            temp = current;
            current = current.next;           
        }
        temp.next = current.next;
        return head;
    }

    public static void main(String[] args){
        SLL list = new SLL();
        list.head = new ListNode(2);
        ListNode second = new ListNode(4); 
        ListNode third = new ListNode(6); 
        ListNode fourth = new ListNode(8); 
        ListNode fifth = new ListNode(10); 

        // connect

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        list.display();
        System.out.println();
        list.removeNode(6);
        list.display();
        
    }
}

