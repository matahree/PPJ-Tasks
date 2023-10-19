public class Problem1{
    public static String swap(String s){
        String s1 = s.substring(0, (s.length())/2);
        String s2 = s.substring((s.length())/2, s.length());
        return s2+s1;
    }

    public static void main(String[] args) {
        System.out.println(swap("abcdefgh"));
    }
}