public class SingLList {
    private static class Node{
        int data;
        Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        Node(int data) {
            this(data, null);
        }

    }
    private Node head;

    public SingLList() {
        this.head = null;
    }
    public SingLList(Node n){
        this.head = n;
    }

    public boolean empty(){
        return head == null;
    }
    public void addFront(int d){
        this.head = new Node(d, head);
    }
    public void addBack(int d){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(d);
    }
    public static SingLList arrayToList(int[] arr){
        Node first = new Node(arr[0]);
        Node current = first;
        for(int i = 1; i<arr.length; i++){
            //current.next = new Node(arr[i]);
            Node nextNode = new Node(arr[i]);
            current.next = nextNode;
            current = nextNode;
        }
        return new SingLList(first);
    }
    public void removeOdd(){
        Node current = head;
        Node currentEven = null;
        boolean foundHead = false;
        while(current != null){
            if(current.data %2 != 0){
                current = current.next;
                continue;
            }
            if(!foundHead){
                this.head = current;
                currentEven = head;
                foundHead = true;
                current = current.next;
                head.next = null;
            }
            else {
                currentEven.next = current;
                currentEven = current;
                current = current.next;
                currentEven.next = null;
            }
        }
        if(!foundHead) head = null;
    }
    public boolean contains(int d){
        Node current = head;
        while(current != null){
            if(current.data == d) return true;
            current = current.next;
        }
        return false;
    }
    public void showList(){
        if(head == null) System.out.println("Empty list");
        else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.print("\n");
    }
    public void clear(){
        this.head = null;
    }
}