public class StatFuns {
    static int maxOfThree(int a, int b, int c) {
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        return max;
    }
    static int greatestDivisor(int n) {
        int divisor = 1;
        for(int i = n-1; i > 0; i--){
            if(n%i == 0){
                divisor = i;
                break;
            }
        }
        return divisor;
    }
    static boolean areRelativelyPrime(int a, int b) {
        boolean test = false;
        int GCD = 1;
        while(a != b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        GCD = b;
        test = (GCD == 1);
        return test;
    }
    static boolean isPerfect(int n) {
        boolean test = false;
        int sum = 0;
        for(int i = 1; i<n; i++){
            if (n % i == 0) {
                sum += i;
            }
        }
        test = (sum == n);
        return test;
    }
    public static void main(String[] args) {
        int x = 2, y = 3, z = 1;
        System.out.println("Max of " + x + ", " + y + ", " +
                z + " is " + maxOfThree(x, y, z));
        for (int a = 12; a < 16; ++a)
            System.out.println("Greatest divisor of " +
                    a + " is " + greatestDivisor(a));
        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
            if (areRelativelyPrime(m, n))
                System.out.println(m + " and " + n +

                        " are relatively prime");
        for (int m = 2; m <= 100; ++m)
            if (isPerfect(m))
                System.out.println(m + " is perfect");
    }
}