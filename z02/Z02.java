import java.util.Locale;
import java.util.Scanner;
public class Z02 {
    public static void main(String[] args) {
        //problem1();
        problem2();
    }
    public static void problem1(){
        int fromy = 2000, fromm = 2, fromd = 3;
        int toy = 2127, tom = 11, tod = 29;
        System.out.println("**** Original\n" +
                "From: " + fromy + "/" +
                fromm + "/" +
                fromd + " to " +
                toy + "/" +
                tom + "/" +
                tod);
        int period = 0;
        //packing into one int:
        fromy = fromy - 2000;
        toy = toy-2000;
        //
        //[year 7b][month 4b][day 5b]
        //
        period = (fromy<<25) + (fromm<<21) + (fromd<<16) + (toy<<9) + (tom<<5) + tod;
        // Delete the comment to see the int:
        //System.out.println("**** Packed into one int: " + period);
        //unpacking:
        fromy = (period>>25)+2000;
        fromm = (period>>21) & 0b1111;
        fromd = (period>>16) & 0b11111;
        toy = ((period>>9) & 127)+2000;
        tom = (period>>5) & 0b1111;
        tod = period & 0b11111;
        System.out.println("**** Reconstructed\n" +
                "From: " + fromy + "/" +
                fromm + "/" +
                fromd + " to " +
                toy + "/" +
                tom + "/" +
                tod);
    }
    public static void problem2(){
        Locale.setDefault(Locale.ENGLISH);
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the a, b, c values of a quadratic equation:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double solution;
        //System.out.println(a + " + " + b + " + " + c);
        if(a == 0){
            //bx + c = 0
            //x = -(c/b)
            solution = -(c/b);
            System.out.println("The root of this linear equation is: " + solution);
        }
        else{
            //ax^2 + bx + c = 0
            double delta = (Math.pow(b, 2)) - 4 * a * c;
            if(delta >= 0){
                double sqrtdelta = Math.sqrt(delta);
                double x1 = (-b - sqrtdelta)/ 2 * a;
                double x2 = (-b + sqrtdelta)/ 2 * a;
                if (delta == 0){
                    System.out.println("The root of this equation is: " + x1);
                }
                else{
                    System.out.println("The roots of this equation are: \n" + x1 + ",\n" + x2);
                }
            }
            else{
                System.out.println("This equation has no real roots.");
                double discr = delta * -1;
                double firstPart =(-b)/2*a;
                //String secondPart = "(sqrt(+"+discr+"))/"+2*a+ " * i";
                double secondPart =Math.sqrt(discr)/2*a;
                String x1 = firstPart + "+"+secondPart+" * i";
                String x2 = firstPart + "-"+secondPart + " * i";
                System.out.println("Complex roots: x1="+x1+", x2="+x2);
            }
        }
    }
}