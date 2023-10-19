public class BracketsStack {
    private NodeBrackets top;

    public void push(char c){
        this.top = new NodeBrackets(c, this.top);
    }

    public char pop(){
        char res = top.getBracket();
        this.top = top.getNext();
        return res;
    }

    public boolean empty(){
        return (top == null);
    }
}