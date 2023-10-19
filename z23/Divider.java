public class Divider extends Task{
    public Divider(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        if(y == 0) throw new ArithmeticException();
        return x/y;
    }
}
