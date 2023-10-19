public class Subtractor extends Task{
    public Subtractor(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return x-y;
    }
}
