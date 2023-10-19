public class Task {
    double x, y;
    public Task(double a, double b) {
        x = a;
        y = b;
    }
    public double execute() {
        throw new UnsupportedOperationException();
    }
    public static Task getInstance(String oper, double a, double b) {
        return switch (oper) {
            case "+" -> new Adder(a, b);
            case "-" -> new Subtractor(a, b);
            case "*" -> new Multiplier(a, b);
            case "/" -> new Divider(a, b);
            default -> throw new IllegalArgumentException();
        };
    }
}