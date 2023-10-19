import java.util.Arrays;


public class Z09{
    public static void main(String[] args){
        problem1();
        //problem2();
        //problem3();
    }
    static void problem1() {
        final int SIZE = 21;
        final int NUMS = 35;
        int[] arr = new int[SIZE];
        int counter = 0;
        //boolean alreadyExists=false;
        int brr[] = new int[NUMS];
        for(int i = 0; i<brr.length; i++){
            brr[i] = i+1;
        }
        for(int i = NUMS-1; i>=0; i--){
            int j = (int)(i * Math.random());
            int t = brr[i];
            brr[i] = brr[j];
            brr[j] = t;
        }
        for(int i = 0; i<SIZE; i++){
            arr[i] = brr[i];
        }
        System.out.println("With SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
/*
        for(int i = 0; i<SIZE; i++){
            do{
                t = (1 + (int)(Math.random() * NUMS));
                for(int j = 0; j<i; j++) {
                    if (arr[j] == t) {
                        alreadyExists = true;
                        counter++;
                    }
                    else{
                        alreadyExists = false;
                    }
                }
                    arr[i] = t;
            }
            while(alreadyExists == true);
            z =+ counter;

        }
        for(int i = 0; i<SIZE; i++){
            arr[i] = (1 + (int)(Math.random() * NUMS));
        }*/

        //test
        //System.out.println(Arrays.toString(arr));
        //System.out.println(z + " tries.");
    }
    static void problem2(){
        int arr[] = {1, 5, 8, 3, 5, 4, 2};
        int len = arr.length - 1;
        int max = arr[0];
        for(int i = 0; i<=len; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = max; i>0; i--){
            for(int j = 0; j<=len; j++){
                if(arr[j] >= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    static void problem3(){
        int[] arr = {2,3,4,3,6,7,6,8,2,9};
        int[] brr = {2,3,6,8,5,1,3};
        int arrlen = arr.length;
        int brrlen = brr.length;
        int larger = arrlen>brrlen ? arrlen : brrlen;
        int smaller = arrlen>brrlen ? brrlen : arrlen;
        boolean doesExist, duplicate;

        for(int i = 0; i < smaller; i++){
            duplicate = false;
            doesExist = false;
            for(int j = 0; j<larger; j++){
                if(brr[i] == arr[j]){
                    doesExist = true;
                }
            }
            for(int k = 0; k < i; k++){
                if(brr[k] == brr[i]){
                    duplicate = true;
                }
            }
            if(doesExist && !duplicate){
                System.out.println(brr[i]);
            }

        }
    }
}