import java.util.Scanner;
public class Z06{
    public static void main(String[] args){
        //problem1();
        //problem2();
        //problem3();
        problem4();
    }
    static void problem1(){
        int n = 67;
        String number = "";
        for(int i = 31; i>=0; i--){
            int b = (n>>i) & 1;
            number = number + "" + b;
        }
        System.out.println(number);
    }
    //
    static void problem2(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String row = "";
        if((n % 2) != 0){
            for(int st = n, sp=0; st>0; st-=2, sp++){
                row = "";
                for(int i = sp; i>0; i--){
                   row += " "; 
                }
                for(int i = st; i>0; i--){
                   row += "*"; 
                }
                for(int i = st; i>0; i--){
                   row += " "; 
                }
                System.out.println(row);
            }
        }
        else{
            System.out.println("Error!");
        }
        
    }
    //
    static void problem3(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int o = n - 1;
        String divisors = "";
        for(int i = 2; i<o; i++){
            if(n%i == 0){
                divisors += i + " ";
            }
        }
        if(divisors.equals("")){
            System.out.println("The number " + n + " is prime");
        }
        else{
            System.out.println("Nontrivial divisors of " + n + ": " + divisors);
        }
    }
    //
    static void problem4(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a <= 0 || b <= 0){
            return;
        }
        while(a != b){
            if(b>a){
                int temp = b;
                b = a;
                a = temp;
            }
            a = a-b;
        }
        System.out.println("Greatest common divisor is: " + a);
    }
}