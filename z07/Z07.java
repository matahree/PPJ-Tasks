import java.util.Scanner;
public class Z07{
    public static void main(String[] args){
        problem1();
        //problem2();
        //problem3();
    }
    static void problem1(){
        Scanner scan = new Scanner(System.in);
        int firstnumber;
        int length1 = 1;
        int length2 = 0;
        int most = 0;
        int k = 0;
        int secondnumber = scan.nextInt();
        if(secondnumber == 0){
            return;
        }
        while((firstnumber = scan.nextInt()) != 0){
            if(secondnumber == firstnumber){
                length1++;
                k = firstnumber;
            }
            else{
                if(length2>length1) {
                    length1 = 1;
                }
                else{
                    length2 = length1;
                    length1 = 1;
                    most = k;
                }
            }
            secondnumber = firstnumber;
        }
        if(firstnumber == 0){
            if(length2>length1) {
            }
            else{
                length2 = length1;
                most = k;
            }
        }
        System.out.println("Longest sequence: "+ most + " appeared " + length2 + " times.");
        }

    static void problem2(){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        if(w <= 0 && h <= 0){
            return;
        }
        for(int i = 0; i<h; i++){
            //starting and ending lines
            if(i == 0 || i == (h-1)){
                for(int j = 0; j<=w; j++){
                    System.out.print("*");
                    if(j==w){
                        System.out.print("\n");
                    }
                }
            }
            //
            else{
                System.out.print("*");
                for(int k = 0; k<=(w-2); k++){
                    System.out.print(" ");
                }
                System.out.print("*\n");

            }
        }
    }
    static void problem3(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String surname = scan.nextLine();
        String combined = name + " " + surname;
        int length = combined.length();
        for(int i = 0; i<=4; i++){
            //starting and ending lines
            if(i == 0 || i == 4){
                for(int j = 0; j<=length+4; j++){
                    System.out.print("*");
                    if(j==length+4){
                        System.out.print("\n");
                    }
                }
            }
            //
            else if(i == 1 || i == 3){
                System.out.print("*");
                for(int k = 0; k<=(length+2); k++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
            else if(i == 2){
                System.out.print("* ");
                System.out.print(combined);

                System.out.print("  *\n");
            }
        }
    }
}