public class Car {
    private String make;
    private int price;
    private Car next;

    public Car(String make, int price, Car next) {
        this.make = make;
        this.price = price;
        this.next = next;
    }

    public Car(String make, int price) {
        this(make, price, null);
    }

    @Override
    public String toString() {
        return make + "("+price+")";
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public Car getNext() {
        return next;
    }

    public void showCars(){
        Car current = this;
        while(current != null){
            System.out.print(current + " ");
            current = current.next;
        }
    }

    public void showCarsRev(){
        if(next == null) System.out.print(this);
        //else this.next.showCarsRev();
        else {
            this.next.showCarsRev();
            System.out.print(" "+this);
        }
    }
}
