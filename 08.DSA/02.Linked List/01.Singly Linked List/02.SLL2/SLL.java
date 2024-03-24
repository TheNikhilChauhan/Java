// Creating and printing Linked list

public class SLL {
    private LinkNode head;
    
    private static class LinkNode{
        private int data;
        private LinkNode next;

        // constructor
        public LinkNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        LinkNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SLL l = new SLL();
        l.head = new LinkNode(10);
        LinkNode second = new LinkNode(1);
        LinkNode third = new LinkNode(8);
        LinkNode fourth = new LinkNode(11);

        // connect
        l.head.next = second;
        second.next = third;
        third.next = fourth;

        l.display();
    }
}
