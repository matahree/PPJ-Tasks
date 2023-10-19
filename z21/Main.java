import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = Files.newBufferedReader(Paths.get("./src/personsInfo.txt"));
                ){
            int n = Integer.parseInt(br.readLine());
/*            System.out.println(n);
            String k = br.readLine();
            System.out.println(k);*/

            Person[] arrOfPersons = new Person[n];
            for(int i = 0; i < n; i++){
                //char[] arr = br.readLine().toCharArray();
                //untill i find spacebar - name, then year, then make
                //if no info pass null to const
                String[] values = br.readLine().split(" ");
                int len = values.length;
                int age = Integer.parseInt(values[1]);
                if(len == 2){
                    Person p = new Person(values[0], age);
                    arrOfPersons[i] = p;
                }
                else{
                    int r = Integer.parseInt(values[3]);
                    int g = Integer.parseInt(values[4]);
                    int b = Integer.parseInt(values[5]);
                    Person p = new Person(values[0], age, new Car(values[2], r,g,b));
                    arrOfPersons[i] = p;
                }
            }
            System.out.println(Arrays.toString(arrOfPersons));
            System.out.println(Arrays.toString(Person.findAllCars(arrOfPersons)));
            System.out.println(Arrays.toString(Person.findOwners(arrOfPersons, "Skoda")));
            System.out.println(Arrays.toString(Person.findOwners(arrOfPersons, "Alfa Romeo")));
            System.out.println(Person.findColor(arrOfPersons, "John", 1980));
            System.out.println(Person.findColor(arrOfPersons, "Jason", 1980));

        } catch (IOException ex){
            System.err.println("No file found");
        }

    }
}
