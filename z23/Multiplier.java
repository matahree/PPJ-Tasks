public class Multiplier extends Task{

    public Multiplier(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return x*y;
    }
}
