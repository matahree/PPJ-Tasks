import java.util.Arrays;

public class Problem3{
    public static void main(String[] args){
        int[][][] opers = {
                { {100, -50, 25}, {150,-300}, {300,-90,100} },
                { {90, -60, 250}, {300,20,-100} },
                { {20, 50}, {300}, {20,-20,40}, {100,-200} }
        };
        System.out.println(Arrays.toString(accounts(opers)));
    }
    public static int[] accounts(int[][][] arr){
        int[] allOperations = new int[arr.length];
        int initialSum = 0;
        for(int i = 0; i<arr.length; i++){
            initialSum = 0;
            for(int j = 0; j < arr[i].length; j++){
                for(int k = 0; k< arr[i][j].length; k++){
                    initialSum += arr[i][j][k];
                }
            }
            allOperations[i] = initialSum;
        }
        return allOperations;
    }
}