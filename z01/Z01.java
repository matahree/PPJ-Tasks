public class Z01{
    public static void main(String[] args) {
        problem1();
        //problem2();
        //problem3();
    }
    public static void problem1() {
        int n = 1437226410;
        //1.
        System.out.println("1. in binary: " + String.format("%5s", Integer.toBinaryString(n&0x1F)).replace(' ', '0'));
        System.out.println("1. in decimal: " + (n&0x1F));
        //2.
        System.out.println("2. " + ((n>>7) & 0x01));
        //3.
        int a = n & 0x00_00_00_FF;
        System.out.println("3. " + a);

        int b = (n & 0x00_00_FF_00) >>> 8;
        System.out.println(b);

        int c = (n & 0x00_FF_00_00) >>> 16;
        System.out.println(c);

        int d = (n & 0xFF_00_00_00) >>> 24;
        System.out.println(d);
        //4.
        int e = (n & 0x00_FF_FF_00) >>> 8;
        System.out.println("4. " + e);
        //5.
        n = 0x7F_FF_FF_FF;
        System.out.println("5. " + n);
        n = 0x80_00_00_00;
        System.out.println(n);
    }
    public static void problem2(){
        int
                a1 = 0x6D, a2 = 0x0F, a = a1 & a2,
                //0x6D = 0110_1101, 13 = 1101  a2 = 0x0F | 0b1101
                b1 = 0xA, b2 = 0x0F, b = b1 | b2,
                //0xA = 1010, 15 = 1111, b2 = 1111 | 0b0101
                c1 = 11 << 2, c2 = 0x6, c = c1 ^ c2;
                //11 = 1011, c1 = 101100, 42 = 101010, c2 = 000110
        System.out.println(a + " " + b + " " + c);
    }
    public static void problem3(){
        int a = 23, r = 121, g = 255, b = 130, x = 0;
        x = (((a<<24) + (r<<16)) + (g<<8)) + b;
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + x);
        //Easier way is to use the class Color:
        //Color color = new Color(r, g, b, a);
        //or (true refers to the fact that it has alpha other than 255):
        //Color color = new Color(x, true);
        //then just use getters to get your values back
        a = 0;
        r = 0;
        g = 0;
        b = 0;
        a = (x & 0xFF000000)>>>24;
        r = (x & 0xFF0000)>>>16;
        g = (x & 0xFF00)>>>8;
        b = (x & 0xFF);
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
    }
}