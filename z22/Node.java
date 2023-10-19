public class Node {
    private double val;
    private Node next;
    Node(double val, Node next){
        this.val = val;
        this.next = next;
    }
    Node(double val){
        this(val, null);
    }

    public double getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }
}