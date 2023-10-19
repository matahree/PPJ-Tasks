public class Adder extends Task{

    public Adder(double a, double b) {
        super(a, b);
    }
    @Override
    public double execute() {
        return x+y;
    }
}
