import java.io.*;
import java.nio.file.*;
public class Problem2 {
    public static void main(String[] args) {
        try(
                InputStream fis = new FileInputStream("./src/z21.pdf");
                BufferedWriter bw = Files.newBufferedWriter(Paths.get("./src/test.txt"));
                ){
                    int n;
                    String line ="";
                    while((n = fis.read()) != -1) {
                        if((n >= 'a' && n <= 'z') || (n >= 'A' && n <= 'Z')){
                            char c = (char)n;
                            line += c;
                        }
                        else{
                            if(line.length() > 3) bw.write(line + "\n");
                            line ="";
                        }
                    }

        } catch (IOException ex){
            System.err.println("No file found");
        }
    }

}
