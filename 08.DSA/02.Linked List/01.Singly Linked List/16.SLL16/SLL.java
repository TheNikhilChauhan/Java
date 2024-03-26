// Detect a loop in linked list

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
    
    public boolean detectLoop(){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        SLL list = new SLL();
        list.head = new ListNode(1);
        ListNode second = new ListNode(2); 
        ListNode third = new ListNode(3); 
        ListNode fourth = new ListNode(4); 
        ListNode fifth = new ListNode(5); 
        ListNode sixth = new ListNode(6); 

        // connect

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        // list.display();
        System.out.println();
    
        System.out.print(list.detectLoop());
        
    }
}


