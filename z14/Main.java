import java.util.Arrays;
public class Main{
    public static void main (String[] args) {
        System.out.println("FuncStat functions:");
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
        System.out.println("Max : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));
        System.out.println("Before: " + Arrays.toString(a));
        FuncStat.reverse(a,0);
        System.out.println("After : " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrome? " +
                FuncStat.isPalindrome("radar"));
        System.out.println("Is 'abba' a palindrome? " +
                FuncStat.isPalindrome("abba"));
        System.out.println("Is 'rover' a palindrome? " +
                FuncStat.isPalindrome("rover"));
        System.out.println("StringCmp functions:");
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        StringCmp.sortSel(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Square functions:");
        Square s1 = new Square(12.5);
        Square s2 = new Square(10);
        Square equal = Square.equalSquare(s1, s2);
        System.out.println(s1.getSide());
        System.out.println(s2.getSide());
        System.out.println(equal.getSide());
    }
}