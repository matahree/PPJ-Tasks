import java.util.Arrays;
import java.util.Locale;

public class StringMisc{
    public static String norm(String name){
        name = name.toLowerCase(Locale.ROOT);
        String first = name.substring(0, 1);
        return first.toUpperCase(Locale.ROOT) + name.substring(1, name.length());
    }
    public static String init(String name){
        String[] arr = name.split(" ");
        String res = "";
        for(int i = 0; i < arr.length-1; i++){
            res += (arr[i].substring(0, 1)).toUpperCase(Locale.ROOT) + ". ";
        }
        res += norm(arr[arr.length-1]);
        return res;
    }
    public static String tr(String s, String from, String to){
        if(from.length() != to.length()) throw new IllegalArgumentException();
        String[] arrFrom = from.split("");
        String[] arrTo = to.split("");
        String firstPart = "";
        String secondPart = "";
        for(int i = 0; i < arrFrom.length; i++){
            for(int j = 0; j < s.length(); j++){
                if((s.substring(j,j+1)).equals(arrFrom[i])){
                    firstPart = s.substring(0, j);
                    secondPart = s.substring(j+1);
                    s = firstPart + arrTo[i] + secondPart;
                }
            }
        }
        return s;
    }
    public static void main (String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }
}