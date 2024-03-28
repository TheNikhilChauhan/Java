// Insert node at the end

public class DLL {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public DLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        } else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        
        tail = newNode;
        length++;
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertLast(1);
        list.insertLast(4);
        list.insertLast(7);

        list.displayForward();
        System.out.println();
        list.displayBackward();
    }
}
