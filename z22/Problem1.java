public class Problem1 {
    public static void main(String[] args) {
        String[] calculation = "2 7 5 + * 20 - 1 4 / /".split(" ");
        RPNStack stack = new RPNStack();
        double a;
        double b;
        for(int i = 0; i<calculation.length; i++){
            switch (calculation[i]) {
                case "+" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                }
                case "-" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                }
                case "*" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                }
                case "/" -> {
                    a = stack.pop();
                    b = stack.pop();
                    if (a == 0) throw new ArithmeticException();
                    stack.push(b / a);
                }
                default -> stack.push(Double.parseDouble(calculation[i]));
            }
        }
        System.out.println(stack.pop());
        if(stack.empty()) System.out.println("OK");
        else System.out.println("not OK");
        //add multiple lines later
    }
}