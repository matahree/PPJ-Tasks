public class Node {
    private Task task;
    private Node next;

    public Node(Task task, Node next) {
        this.task = task;
        this.next = next;
    }
    public Node(Task task){
        this(task, null);
    }

    public Task getTask() {
        return task;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}