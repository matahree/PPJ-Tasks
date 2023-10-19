public class FuncStat{
    public static int fiboR(int n){
        //fn = n for 0<=n<2
        //fn = f(n-1)+f(n-2) for n>-2
        int fn = 0;
        if(n<0) throw new IllegalArgumentException();
        if(n < 2) fn = n;
        else{
            fn = (fiboR(n-1) + fiboR(n-2));
        }
        return fn;
    }
    public static int fiboI(int n){
        int fn = 0;
        int a;
        int b = 0;
        for(int i = 0; i<=n; i++){
            if(i < 2) fn += i;
            else{
                a = b;
                b = fn;
                fn = a + b;
            };
        }
        return fn;
    }
    public static int factR(int n){
        if(n<0) throw new IllegalArgumentException();
        if(n<=1) return 1;
        return n * factR(n - 1);
    }
    public static int factI(int n){
        int factn = 1;
        for(int i = n; i>0; i--){
            factn *= i;
        }
        return factn;
    }
    public static int gcdR(int a, int b){
        if(b != a) return a>b ? gcdR(a-b, b) : gcdR(b-a, a);
        return b;
    }
    public static int gcdI(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return b;
    }
    public static int maxElem(int[] arr, int from){
        int maxIndex = from;
        for(int i = from; i<arr.length; i++){
            if(arr[i] > arr[maxIndex]) maxIndex = i;
        }
        int tmp = arr[maxIndex];
        arr[maxIndex] = arr[from];
        arr[from] = tmp;
        if(from < arr.length-1){
            from++;
            maxElem(arr, from);
        }
        return arr[0];
    }
    public static int numEven(int[] arr, int from){
        int result=0;
        if(arr[from] % 2 == 0) result++;
        if(from < arr.length-1){
            from++;
            result += numEven(arr, from);
        }
        return result;
    }
    public static void reverse(int[] arr, int from){
        if (from < arr.length/2) {
            int last = arr.length - 1 - from;
            int tmp = arr[last];
            arr[last] = arr[from];
            arr[from] = tmp;
            reverse(arr, from+1);
        }
    }
    public static boolean isPalindrome(String s){
        if(s.length() < 2) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        return isPalindrome(s.substring(1,s.length()-1));
    }
}