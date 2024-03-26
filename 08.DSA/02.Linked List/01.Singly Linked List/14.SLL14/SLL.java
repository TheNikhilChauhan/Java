// Insert a node in a sorted linked list
// Suppose we already have a sorted linked list and now we are inserting a new node

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
    public ListNode insertNode(int value){
        ListNode current = head;
        ListNode newNode = new ListNode(value);
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;           
        }
        newNode.next = current;
        temp.next = newNode;
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
        list.insertNode(7);
        list.display();
        
    }
}
