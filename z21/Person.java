import java.awt.*;

public class Person {
    private String name;
    private int birthYear;
    private Car car;
    public Person(String name, int birthYear, Car car) {
        this.name = name;
        this.birthYear = birthYear;
        this.car = car;
    }
    public Person(String name, int birthYear){
        this(name, birthYear, null);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", car=" + car +
                '}';
    }
    public static Car[] findAllCars(Person[] persons){
        int counter = 0;
        for(int i = 0; i<persons.length; i++){
            if(persons[i].getCar() != null) counter++;
        }
        Car[] cars = new Car[counter];
        for(int i = 0, j = 0; i< persons.length; i++){
            if(persons[i].getCar() != null){
                cars[j] = persons[i].getCar();
                j++;
            }
        }
        return cars;
    }
    public static Person[] findOwners(Person[] persons, String make){
        int counter = 0;
        for(int i = 0; i<persons.length; i++){
            if(persons[i].getCar() != null && persons[i].getCar().getMake().equals(make)){
                counter++;
            }
        }
        Person[] arr = new Person[counter];
        for(int i = 0, j = 0; i< persons.length; i++) {
            if (persons[i].getCar() != null && persons[i].getCar().getMake().equals(make)) {
                arr[j] = persons[i];
                j++;
            }
        }
        return arr;
    }
    public static Color findColor(Person[] person, String name, int year){
        for(int i = 0; i< person.length; i++){
            if(person[i].getCar() != null && person[i].getName().equals(name) && person[i].getBirthYear() == year){
                return person[i].getCar().getColor();
            }
        }
        return null;
    }
}
