import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problem1 {
    public static void main(String[] args) {
        String[] regexes = {"(\\w){3,}\\s+(\\w){3,}\\s+(\\w){3,}",
                            "\\d|[1-7]\\d|8[0-8]",
                            "(\\d){4}-[1-9][0-2]?-(\\d){1,2}",
                            "(\\w)+@(\\w)+.com"};
        Scanner scan = new Scanner(System.in);
        String line;
        while(!(line = scan.nextLine()).startsWith("q")){
            System.out.println(line);
            for(int i = 0; i< regexes.length; i++){
                Matcher m = Pattern.compile(regexes[i]).matcher(line);
                System.out.println(regexes[i] + " -> " + m.matches());
            }
        }
    }
}