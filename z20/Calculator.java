public class Calculator extends CalculatingDevice{
    public Calculator(String name) {
        super(name);
    }
    @Override
    public String calculate(double x, double y){
        String addition = super.calculate(x, y);
        double subtraction = x-y;
        return addition + " " + subtraction;
    }
}