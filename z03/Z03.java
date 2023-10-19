import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;
public class Z03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        //problem1();
        //problem2();
        //problem3();
        //problem4();
        problem5();
    }
    public static void problem1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height in meters:");
        double height = scan.nextDouble();
        System.out.println("Enter your weight in kilograms:");
        double weight = scan.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        JOptionPane.showMessageDialog(null, "Your BMI is " + BMI);
        scan.close();
    }
    public static void problem2(){
        double output = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = scan.nextDouble();
        System.out.println("Enter the operator: ");
        String operator = scan.next();
        System.out.println("Enter the second number: ");
        double y = scan.nextDouble();
        switch (operator) {
            case "+":
                output = (x + y);
                System.out.println(x + " " + operator + " " + y + " = " + output);
                break;
            case "-":
                output = (x - y);
                System.out.println(x + " " + operator + " " + y + " = " + output);
                break;
            case "*":
                output = (x * y);
                System.out.println(x + " " + operator + " " + y + " = " + output);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Error! Division by 0!");
                } else {
                    output = (x / y);
                    System.out.println(x + " " + operator + " " + y + " = " + output);
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
    public static void problem3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int t;
        if(a>b){
            t = a;
            a = b;
            b = t;
        }
        if(b>c){
            t = b;
            b = c;
            c = t;
        }
        if(a>b){
            t = a;
            a = b;
            b = t;
        }

        System.out.println(a + ", " + b + ", " + c);
    }
    public static void problem4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 ints: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        int min = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("The difference between the largest and smallest int is " + (max - min));
    }
    public static void problem5(){
        Scanner scan = new Scanner(System.in);
        int a1 = 2;
        int a2 = 4;
        int b1 = 1;
        int b2 = 6;
        String set1 = "["+a1+","+a2+"]";
        String set2 = "["+b1+","+b2+"]";
        System.out.println("Enter a number: ");
        int x = scan.nextInt();
        System.out.println("Set A: "+set1);
        System.out.println("Set B: "+set2);
        System.out.println("Entered number: "+x);
        ///
        System.out.println("Test 1 - x in set A");
        boolean test1 = (x>= a1 && x<=a2);
        System.out.println("Is "+x+" in "+set1+"? "+test1);
        System.out.println("**********");
        //
        System.out.println("Test 2 - x in set B");
        boolean test2 = (x>= b1 && x<=b2);
        System.out.println("Is "+x+" in "+set2+"? "+test2);
        System.out.println("**********");
        //
        int larger1 = Math.max(a1, b1);
        int smaller1 = Math.min(b1, a1);
        int larger2 = Math.max(a2, b2);
        int smaller2 = Math.min(b2, a2);
        //error
        System.out.println("Test 3 - x in A\\B");
        boolean test3 = (x >= a1 && x < b1 || x <= a2 && x > b2);
        System.out.println("Is "+x+" in "+set1+" - "+set2+"? "+test3);
        System.out.println("**********");
        //error
        System.out.println("Test 4 - x in B\\A");
        boolean test4 = (x >= b1 && x < a1 || x <= b2 && x > a2);
        System.out.println("Is "+x+" in "+set2+" - "+set1+"? "+test4);
        System.out.println("**********");
        //
        System.out.println("Test 5 - x in intersection of A and B");
        boolean test5 = (x >= larger1 && x<=smaller2);
        System.out.println("Is "+x+" in intersection of "+set1+" and "+set2+"? "+test5);
        System.out.println("**********");
        //
        System.out.println("Test 6 - x in union of A and B");
        boolean test6 = (x >= smaller1 && x<=larger2);
        System.out.println("Is "+x+" in union of "+set1+" and "+set2+"? "+test6);
        System.out.println("**********");
        //
        System.out.println("Test 7 - x in symm. diff. of A and B");
        boolean test7 = (x >=smaller1 && x<=larger1) || (x>=smaller2 && x<=larger2);
        System.out.println("Is "+x+" in symm. diff. of "+set1+" and "+set2+"? "+test7);

    }
}