// Add two singly linked list

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

    public static ListNode addList(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(a != null && b != null){
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
    
    

    public static void main(String[] args){
        SLL list = new SLL();
        list.head = new ListNode(7);
        ListNode second = new ListNode(4); 
        ListNode third = new ListNode(9); 
        SLL list2 = new SLL();
        list2.head = new ListNode(5); 
        ListNode fourth = new ListNode(6); 
        ListNode fifth = new ListNode(7); 

        // connect

        list.head.next = second;
        second.next = third;
        list2.head.next = fourth;
        fourth.next = fifth;

        // list.display();
        
    
        SLL result = new SLL();
        result.head = addList(list.head, list2.head);
        System.out.println();
        result.display();
        
    }
}



