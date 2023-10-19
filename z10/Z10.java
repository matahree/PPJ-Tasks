import java.util.Arrays;

public class Z10{
    public static void main(String[] args){
        //problem1();
        //problem2();
        problem3();
    }
    static void problem1(){
        //rows:cols
        int rows = 10;
        int cols = 12;
        int count=0;
        int[][]arr = new int[rows][cols];
        //fill it with random numbers:
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        //elements in last column have row number i and col number i-1
        for(int i = 0; i<rows; i++){
            count += arr[i][cols-1];
        }
        System.out.println(count);
        //System.out.println(Arrays.deepToString(arr));
    }
    static void problem2(){
        int rows, cols;
        rows = cols = 10;
        int count = 0;
        int[][]arr = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i = 0; i<rows; i++){
            count += arr[i][i];
        }
        System.out.println(count);
    }
    static void problem3(){
        int[][] arr = {
                {1,3,2},
                {3,4,8},
                {2,6,8},
                {1,8,5} };
        int length1 = arr[0].length;
        int max = 0;
        int sum = 0;
        int indexMax = 0;
        //Row with largerst sum:
        for(int i = 0; i<length1; i++){
            max += arr[0][i];
        }
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum>max){
                max = sum;
                indexMax = i;
            }
            sum = 0;
        }
        //System.out.println(Arrays.toString(arr[indexMax]));
        System.out.println("Row with the highest sum of elements: " + indexMax);
        //Col with highest sum:
        max = 0;
        sum = 0;
        indexMax = 0;
        for(int i = 0; i<arr.length; i++){
            max += arr[i][0];
        }
        //System.out.println(max);
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j<arr.length; j++){
                sum += arr[j][i];
            }
            if(sum>max){
                max = sum;
                indexMax = i;
            }
            sum = 0;
        }
        System.out.println("Column with largest sum of elements: " + indexMax);
    }
}