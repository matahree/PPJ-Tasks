import java.util.Arrays;
import java.util.Scanner;

public class Z11{
    public static void main(String[] args){
        //problem1();
        //problem2();
        //problem3();
        problem4();
    }
    static void problem1(){
        String[][] arr =
                {       {"Kenya", "Nairobi"},
                        {"Rwanda", "Kigali"},
                        {"Gambia", "Banjul"},
                        {"Ghana", "Accra"},
                        {"Niger", "Niamey"},
                        {"Zambia", "Lusaka"}};
        int indexCountry = -1;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for(int i = 0; i<arr.length; i++){
            if(s.equals(arr[i][0])){
                indexCountry = i;
                break;
            }
        }
        if (indexCountry == -1) {
            System.out.println("No country with that name was found!");
        } else {
            System.out.println(arr[indexCountry][1]);
        }
    }
    static void problem2(){
        int[][] arr = { {1,3}, {3,4,5,8}, {6,8}, {1,9,6} };
        int[] array2 = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            int max = arr[i][0];

            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                array2[i] = max;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
    static void problem3(){
        int[][] arr = {
                {1,2,3,4,5},
                {1,9},
                {3,1,8} };
        int counterOdd = 0;
        int counterEven = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    counterEven++;
                }
                else{
                    counterOdd++;
                }
            }
        }
        int[] array2 = {counterEven, counterOdd};
        System.out.println("Even: " + array2[0] + ", Odd: "+ array2[1]);
    }
    static void problem4(){
        String[][] arr =
                {       {"Germany", "2", "Scotland", "1"},
                        {"Poland", "2", "Germany", "0"},
                        {"Germany", "1", "Ireland", "1"},
                        {"Poland", "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland", "0"},
                        {"Ireland", "1", "Poland", "1"},
                        {"Ireland", "1", "Scotland", "1"},
                        {"Germany", "3", "Poland", "1"},
                        {"Scotland", "2", "Germany", "3"},
                        {"Ireland", "1", "Germany", "0"},
                        {"Scotland", "2", "Poland", "2"},
                        {"Poland", "2", "Ireland", "1"} };
        //int[Ger, Ire, Pol, Scot]
        int scoreGer = 0;
        int scoreIre = 0;
        int scorePol = 0;
        int scoreScot = 0;
        String winner = "";
        String draw1 = "";
        String draw2 = "";
        int[] scores = new int[4];
        for(int i = 0; i<arr.length; i++){
            int score1 = Integer.parseInt(arr[i][1]);
            int score2 = Integer.parseInt(arr[i][3]);
            if(score1 > score2){
                winner = arr[i][0];
                switch (winner) {
                    case "Germany" -> scoreGer += 3;
                    case "Ireland" -> scoreIre += 3;
                    case "Poland" -> scorePol += 3;
                    case "Scotland" -> scoreScot += 3;
                }
            }
            if(score1 < score2){
                winner = arr[i][2];
                switch (winner) {
                    case "Germany" -> scoreGer += 3;
                    case "Ireland" -> scoreIre += 3;
                    case "Poland" -> scorePol += 3;
                    case "Scotland" -> scoreScot += 3;
                }
            }
            if(score1 == score2){
                draw1 = arr[i][0];
                draw2 = arr[i][2];
                switch (draw1) {
                    case "Germany" -> scoreGer++;
                    case "Ireland" -> scoreIre++;
                    case "Poland" -> scorePol++;
                    case "Scotland" -> scoreScot++;
                }
                switch (draw2) {
                    case "Germany" -> scoreGer++;
                    case "Ireland" -> scoreIre++;
                    case "Poland" -> scorePol++;
                    case "Scotland" -> scoreScot++;
                }
            }
        }
        scores[0] = scoreGer;
        scores[1] = scoreIre;
        scores[2] = scorePol;
        scores[3] = scoreScot;
        System.out.println(Arrays.toString(scores));
    }
}