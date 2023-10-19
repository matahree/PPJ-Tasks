import java.io.*;
import java.nio.file.*;

public class Problem2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get("./src/sampletext.txt"));
            String line;
            BracketsStack stack = new BracketsStack();
            int lineCounter = 1;
            while(br.readLine() != null){
                lineCounter++;
                line = br.readLine();
                char[] arr = line.toCharArray();
                for(int i = 0; i<arr.length; i++){
                    if(isOpeningBracket(arr[i])){
                        stack.push(arr[i]);
                    }
                    else if(isClosingBracket(arr[i])){
                        char opening = stack.pop();
                        if(opening != arr[i]){
                            System.out.println(line);
                            for(int j = 0; j<i; j++){
                                System.out.print(" ");
                            }
                            System.out.print("^");
                            System.out.println();
                            System.out.println("Error in line "+lineCounter+". '"+arr[i]+"' found but '"+correspondingClosingBracket(opening)+"' expected.");

                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("No file found");
        }


    }
    public static boolean isOpeningBracket (char c){
        return (c == '(' || c == '{' || c == '[');
    }
    public static boolean isClosingBracket (char c){
        return (c == ')' || c == '}' || c == ']');
    }
    public static char correspondingClosingBracket(char c){
        char res = 'x';
        switch (c) {
            case '(' -> res = ')';
            case '{' -> res = '}';
            case '[' -> res = ']';
        }
        return res;
    }
}