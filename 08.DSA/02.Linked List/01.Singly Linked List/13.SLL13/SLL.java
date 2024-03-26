// Remove duplicates from sorted linked list

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

    public void removeDuplicate(){
        ListNode current = head;
        while(current != null && current.next != null){
            // 1->2->3->3->4->n
            if(current.data == current.next.data){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
            
        }
        
    }

    public static void main(String[] args){
        SLL list = new SLL();
        list.head = new ListNode(8);
        ListNode second = new ListNode(8); 
        ListNode third = new ListNode(11); 
        ListNode fourth = new ListNode(1); 
        ListNode fifth = new ListNode(1); 

        // connect

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        list.display();
        System.out.println();
        list.removeDuplicate();
        list.display();
    }
}
