public class RPNStack {
    private Node top;


    public void push(double d){
        this.top = new Node(d, this.top);
    }
    public double pop(){

        double res = top.getVal();
        this.top = top.getNext();
        return res;
    }
    public boolean empty(){
        return (top == null);
    }
}