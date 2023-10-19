import java.util.Arrays;

public class Problem3{
    public static void main(String[] args){
        int[][] a = {
                {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));
    }
    public static int[][] inner(int[][] arr){
        int[][] innerArray = new int[arr.length-2][arr[0].length-2];
        for(int i = 1; i<arr.length-1; i++){
            for(int j = 0; j<innerArray[0].length; j++){
                innerArray[i-1][j] = arr[i][j+1];
            }
        }
        return innerArray;
    }
}