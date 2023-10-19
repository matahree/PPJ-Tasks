public class Computer extends Calculator{

    public Computer(String name) {
        super(name);
    }

    @Override
    public String calculate(double x, double y){
        String addAndSub = super.calculate(x, y);
        double mult = x*y;
        double div = x/y;
/*        try{
            double div = x/y;
        }catch (ArithmeticException ex){
            System.out.println("Division by zero!");
        }*/
        return addAndSub + " " + mult + " " + div;
    }
}