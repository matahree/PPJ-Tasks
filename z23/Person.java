public class Person {
    private String name;
    private Car cars;
    public Person(String name) {
        this.name = name;
        cars = null;
    }
    public Person buys(String make, int price){
        this.cars = new Car(make, price, cars);
        return this;
    }
    public String getName(){
        return this.name;
    }
    public void showCars(){
        cars.showCars();
    }
    public void showCarsRev(){
        cars.showCarsRev();
    }
    public int getTotalPrice(){
        int price = 0;
        Car current = cars;
        while(current != null){
            price += current.getPrice();
            current = current.getNext();
        }
        return price;
    }
    public boolean hasCar(String make){
        Car current = cars;
        while(current != null){
            if(current.getMake().equalsIgnoreCase(make)) return true;
            current = current.getNext();
        }
        return false;
    }
    public Car mostExpensive(){
        Car current = cars;
        if(current == null) return null;
        int highestPrice = cars.getPrice();
        Car mostExpensive = current;
        while(current != null){
            if(current.getPrice() > highestPrice){
                highestPrice = current.getPrice();
                mostExpensive = current;
            }
            current = current.getNext();
        }
        return mostExpensive;
    }
}
