import java.util.Arrays;

public class DNA{

    public static void main (String[] args) {
        String a = "AACTACGTC";
        String b = "ACGTA";
        System.out.println(a + " and " + b +
                " -> " + simil(a, b));
        String c = "GCGC";
        String d = "AGGGCA";
        System.out.println(c + " and " + d +
                " -> " + simil(c, d));
    }

    public static int simil(String a, String b){
        int d = 0;
        if(a.length() == b.length()){
            int score = 0;
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == b.charAt(i)) score++;
                else{
                    d+= score*score;
                    score = 0;
                }
            }
            d += score*score;
        }
        else{
            if(b.length() > a.length()){
                String tmp = a;
                a = b;
                b = tmp;
            }
            String[] arr = new String[a.length() - b.length() + 1];
            for(int i = 0; i < arr.length; i++){
                arr[i] = a.substring(i, i+b.length());
            }
            //System.out.println(Arrays.toString(arr));
            int max = 0;
            for(int i = 0; i<arr.length; i++){
                int check = simil(b, arr[i]);
                if(check > max) max = check;
            }
            d = max;
        }
        return d;
    }
}