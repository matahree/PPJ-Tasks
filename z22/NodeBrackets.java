public class NodeBrackets {
    private char bracket;
    private NodeBrackets next;
    NodeBrackets(char bracket, NodeBrackets next){
        this.bracket = bracket;
        this.next = next;
    }
    NodeBrackets(char bracket){
        this(bracket, null);
    }

    public char getBracket() {
        return bracket;
    }

    public NodeBrackets getNext() {
        return next;
    }
}