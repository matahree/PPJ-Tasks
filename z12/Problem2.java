import java.util.Arrays;

public class Problem2{
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println("Array before: " + Arrays.toString(arr) + ", array after: " + Arrays.toString(swap(arr)));
    }
    public static int[] swap(int[] arr){
        //finding out the max and min:
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        //swap:
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == min){
                arr[i] = max;
            }
            else if(arr[i] == max){
                arr[i] = min;
            }
        }
        return arr;
    }
}