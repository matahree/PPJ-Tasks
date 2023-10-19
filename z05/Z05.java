import java.util.Scanner;
public class Z05 {
    public static void main(String[] args) {
        //problem1();
        //problem2();
        //problem3();
        //problem4();
        //problem5();
        problem6();
    }
    public static void problem1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a natural number greater than 1: ");
        int n = scan.nextInt();
        scan.close();
        if(n < 1) throw new IllegalArgumentException();
        int i, count = 0;
        System.out.println("================");
        System.out.println("Divisors:");
        for(i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("================");
        if(count == 2){
            System.out.println("The number " + n + " is prime.");
        }
        System.out.println("Total number of divisors: " + count);
    }
    public static void problem2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers, 0 stops the program:");
        int k = scan.nextInt();
        if(k == 0) return;
        int max = k;
        int min = k;

        while((k = scan.nextInt()) != 0){
            if(k>max){
                max = k;
            }
            if(k<min){
                min = k;
            }
        }
        scan.close();
        System.out.println("Maximum entered value: " + max + "\nMinimum entered value: " + min);
    }
    public static void problem3(){
        String suit = "";
        String sign = "";
        int a = 1 + (int)(Math.random()*4);
        int b = 2 + (int)(Math.random()*13);
        switch (a) {
            case 1 -> suit = "clubs";
            case 2 -> suit = "diamonds";
            case 3 -> suit = "hearts";
            case 4 -> suit = "spades";
        }
        if (b >= 2 && b <= 10){
            sign = "" + b;
        }
        else{
            sign = switch (b) {
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 14 -> "Ace";
                default -> sign;
            };
        }
        System.out.println(sign + " of " + suit);
    }
    public static void problem4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a natural number to see if it's prime: ");
        int n = scan.nextInt();
        scan.close();
        int i, count = 0;
        for(i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.println("================");
        if(count == 2){
            System.out.println("The number " + n + " is prime.");
        }
        else{
            System.out.println("The number " + n + " is not prime.");
        }
        System.out.println("Total number of divisors: " + count);
    }
    public static void problem5(){
        double probability, delta;
        int count = 0;
        double a, b, c;
        for(int i = 1; i<= 1_000_000; i++){
            a = Math.random();
            b = Math.random();
            c = Math.random();
            delta = Math.pow(b, 2) - (4 * a * c);

            if(delta >= 0.0){
                count++;
            }
        }
        probability = count / 10_000D;
        System.out.println(probability + "%");
        System.out.println("Expected value: 25.441342%");
    }
    public static void problem6(){
        int n = 15;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n ; j++){
                System.out.printf("%4d",j*i);
            }
            System.out.println();
        }
    }
}