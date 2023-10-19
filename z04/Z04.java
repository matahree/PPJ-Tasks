import java.util.Scanner;

public class Z04{
    public static void main(String[] args) {
        //problem1();
        //problem2();
        //problem3();
        //problem4(102);
        problem5();
    }
    public static void problem1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three natural numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        if(a >= 0 && b >= 0 && c >= 0){
            if((a == b && a !=c) || (a==c && a != b) || (b == c && b != a)){
                System.out.println("OK");
            }
            else{
                System.out.println("NOT OK");
            }
        }
    }
    public static void problem2(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        if(a >= 0 && b >= 0 && c >= 0){
            if((a+b) > c && (a+c) > b && (b+c) > a){
                System.out.println("OK");
            }
            else{
                System.out.println("NOT OK");
            }
        }
    }
    public static void problem3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a -> ");
        int a = scan.nextInt();
        System.out.print("Enter b -> ");
        int b = scan.nextInt();
        scan.close();
        String s1 = "";
        String s2 = "";
        //string 1
        if(a == b){
            s1 = " = ";
            s2 = " = ";
        }
        if(a != b){
            s1 = " != ";
        }
        //string2
        if(a > b){
            s2 = " > ";
        }
        if(a < b){
            s2 = " < ";
        }
        System.out.println(a + s1 + b);
        System.out.println(a + s2 + b);
    }
    public static void problem4(int font){
        int family = font & 0b11;
        int style = (font & 0b1100)>>2;
        int weight = (font & 0b10000)>>4;
        int size = (font & 0b11100000)>>5;
        String s1, s2, s3, s4;
        String s5 = "n=" + font + ": ";
        /*
        System.out.println(family);
        System.out.println(style);
        System.out.println(weight);
        System.out.println(size);
        */
        s1 = switch (family) {
            case 0 -> "Courier";
            case 1 -> "Times";
            case 2 -> "Arial";
            case 3 -> "Helvetica";
            default -> "";
        };
        s2 = switch (style) {
            case 0 -> "plain";
            case 1 -> "italic";
            case 2 -> "slanted";
            default -> "illegal style";
        };
        s3 = switch (weight) {
            case 0 -> "normal";
            case 1 -> "bold";
            default -> "";
        };
        s4 = switch (size) {
            case 0 -> "x-small";
            case 1 -> "small";
            case 2 -> "medium";
            case 3 -> "large";
            case 4 -> "x-large";
            default -> "illegal size";
        };
        if(s2.equals("illegal style")){
            System.out.println(s5 + s2);
        }
        else if(s4.equals("illegal size")){
            System.out.println(s5 + s4);
        }
        else{
            System.out.println(s5 + s1 +", " + s2 + ", " + s3 + ", " + s4);
        }
    }
    public static void problem5(){
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter three boolean values (true or false)");
        boolean a = sca.nextBoolean();
        boolean b = sca.nextBoolean();
        boolean c = sca.nextBoolean();
        sca.close();
        boolean allThree = a && b && c;

        boolean exactlyTwo = (a^b)&(c) || (a^c)&(b) || (b^c)&(a);

        boolean exactlyOne = (!(a & b & c)) && (!exactlyTwo) && !(a==b==c==false);

        boolean atLeastOne = ((a | b) | c);
        boolean atLeastTwo = (a && b) || (a && c) || (b && c);

        System.out.println("a, b, c = " + a + ", " + b + ", " + c +
                "\nallThree: " + allThree +
                "\nexactlyOne: " + exactlyOne +
                "\nexactlyTwo: " + exactlyTwo +
                "\natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);
    }
}