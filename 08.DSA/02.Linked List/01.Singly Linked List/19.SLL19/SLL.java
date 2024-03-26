// Merge two sorted singly linked lists

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

    public static ListNode joinList(ListNode a, ListNode b){
        ListNode current = new ListNode(0);
        ListNode tail = current;
        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            } else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null){
            tail.next = b;
        }else {
            tail.next = a;
        }
        return current.next;
    }
    
    

    public static void main(String[] args){
        SLL list = new SLL();
        list.head = new ListNode(1);
        ListNode second = new ListNode(4); 
        ListNode third = new ListNode(8); 
        SLL list2 = new SLL();
        list2.head = new ListNode(3); 
        ListNode fourth = new ListNode(6); 
        ListNode fifth = new ListNode(7); 

        // connect

        list.head.next = second;
        second.next = third;
        list2.head.next = fourth;
        fourth.next = fifth;

        // list.display();
        
    
        SLL result = new SLL();
        result.head = joinList(list.head, list2.head);
        System.out.println();
        result.display();
        
    }
}


