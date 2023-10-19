public class QueueOfTasks {
    private Node top;
    private Node tail;

    public QueueOfTasks() {
        top = tail = null;
    }

    public void enqueue(Task t){
        if(top == null) top = tail = new Node(t);
        else {
            tail.setNext(new Node(t));
            tail = tail.getNext();
        }
    }
    public Task dequeue(){
        Task t = top.getTask();
        top = top.getNext();
        if(top == null) tail = null;
        return t;
    }
    public boolean empty(){
        return (top == null);
    }
}