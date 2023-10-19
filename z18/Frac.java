import java.util.Objects;

public class Frac{
    private int num;
    private int denom;
    public Frac(int num, int denom) {
        int[] brr = normalise(num, denom);
        this.num = brr[0];
        this.denom = brr[1];
    }
    public Frac(int num){
        this(num, 1);
    }
    public Frac(){
        this(0,1);
    }
    private static int gcd(int a, int b){
        if(a < 0) a*= -1;
        if(b < 0) b*= -1;
        while(a != b){
            if(b>a){
                int temp = b;
                b = a;
                a = temp;
            }
            a = a-b;
        }
        return a;
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frac frac = (Frac) o;
        return getNum() == frac.getNum() && getDenom() == frac.getDenom();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNum(), getDenom());
    }

    @Override
    public String toString() {
        if(denom == 1) return String.valueOf(num);
        return num + "/" + denom;
    }

    private static int[] getCommonDenoms(Frac a, Frac b){
        int firstNum = a.getNum() * b.getDenom();
        int secondNum = b.getNum() * a.getDenom();
        int denom = b.getDenom() * a.getDenom();
        return new int[]{firstNum, secondNum, denom};
    }
    private static int[] normalise(int x, int y){
        if(y == 0) throw new ArithmeticException();
        if(x != 0) {
            int gcd = gcd(x, y);
            x /= gcd;
            y /= gcd;
        }
        if(y < 0){
            x *= -1;
            y *= -1;
        }
        if(x == 0){
            y = 1;
        }
        return new int[]{x, y};
    }
    public static Frac add(Frac a, Frac b){
        int[] arr = getCommonDenoms(a, b);
        int[] brr = normalise(arr[0]+arr[1],arr[2]);
        return new Frac(brr[0],brr[1]);
    }
    public static Frac sub(Frac a, Frac b){
        int[] arr = getCommonDenoms(a, b);
        int[] brr = normalise(arr[0]-arr[1],arr[2]);
        return new Frac(brr[0],brr[1]);
    }
    public static Frac mul(Frac a, Frac b){
        int[]brr = normalise(a.getNum()*b.getNum(), a.getDenom()*b.getDenom());
        return new Frac(brr[0],brr[1]);
    }
    public static Frac div(Frac a, Frac b){
        if(b.getNum() == 0) throw new ArithmeticException();
        int[]brr = normalise(a.getNum() * b.getDenom(), b.getNum() * a.getDenom());
        return new Frac(brr[0], brr[1]);
    }

    public Frac add(Frac other){
        int[] arr = getCommonDenoms(this, other);
        int[] brr = normalise(arr[0]+arr[1],arr[2]);
        this.num = brr[0];
        this.denom = brr[1];
        return this;
    }
    public Frac sub(Frac other){
        int[] arr = getCommonDenoms(this, other);
        int[] brr = normalise(arr[0]-arr[1],arr[2]);
        this.num = brr[0];
        this.denom = brr[1];
        return this;
    }
    public Frac mul(Frac other){
        int[] brr = normalise(this.num*other.getNum(), this.denom*other.getDenom());
        this.num = brr[0];
        this.denom = brr[1];
        return this;
    }
    public Frac div(Frac other){
        if(other.getNum() == 0) throw new ArithmeticException();
        int[] brr = normalise(this.num*other.getDenom(), this.denom*other.getNum());
        this.num = brr[0];
        this.denom = brr[1];
        return this;
    }
}