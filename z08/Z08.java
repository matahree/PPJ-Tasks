import java.util.Arrays;
public class Z08{
    public static void main(String[] args){
        //problem1();
        //problem2();
        //problem3();
        problem4();
    }
    static void problem1(){
        int k = 0;
        int l = 0;
        int[] array1 = {2, 4, 7 ,3 ,2, 6, 8, 8, 9, 9};
        for (int number : array1){
            System.out.print(number + " ");
        }
        System.out.println("");
        for(int i = 0; i< array1.length; i++){
            if(array1[i] % 2 != 0){
              k = i;
              break;
            }
        }
        for(int j = array1.length-1; j >= 0; j--){
            if(array1[j] % 2 == 0){
                l = j;
                break;
            }
        }
        int m = array1[k];
        int n = array1[l];
        array1[l] = m;
        array1[k] = n;
        for (int number : array1){
            System.out.print(number + " ");
        }
    }
    static void problem2(){
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        int k = arr[0];
        for(int i = 0; i < length; i++){
            if(i == length-1){
                arr[length-1] = k;
            }
            else{
                arr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void problem3(){
        int[] arr = {2,3,4,3,2,6,3,6,8,2,9};
        int counter = 0;
        //check if number arr[i] is different from arr[i-1]
        //also if it is different from numbers previously checked?
        for(int i = 0; i<arr.length; i++){
            boolean found = false;
            for(int j = 0; j<i; j++){
                if(arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if(!found){
                counter++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nThere were " + counter + " different numbers");

    }
    static void problem4(){
        int[] arr = {4, 3, 1, -2, 4, -2, 2, 4, 3};
        //1.
        for(int i = 0; i<arr.length; i++){
            if(i != arr.length-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i] + "\n");
            }
        }
        //2.
        int indexSmallest = 0;
        int smallest = arr[indexSmallest];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                indexSmallest = i;
            }
        }
        //3.
        int indexLargest = arr.length-1;
        int largest = arr[indexLargest];
        for (int i = arr.length-2; i>=0 ; i--){
            if (arr[i] > largest){
                largest = arr[i];
                indexLargest = i;
            }
        }
        //4.
        int t = arr[indexSmallest];
        arr[indexSmallest] = arr[indexLargest];
        arr[indexLargest] = t;
        //5.
        for(int i = 0; i<arr.length; i++){
            if(i != arr.length-1){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i] + "\n");
            }
        }
        //6.
        for(int i = arr.length-1; i>=0; i--){
            if(i != 0){
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.print(arr[i] + "\n");
            }
        }
    }

}