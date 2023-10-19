public class Car {
    private int fuel;
    private int kilos;

    public Car() {
        this.fuel = 35;
        this.kilos = 0;
    }

    public void fill(){
        if(Math.random() <= 0.1) throw new Explosion("BOOM");
        fuel += (int)(15 + Math.random()*21);
        System.err.println("Fuel level: " + fuel);

    }
    public void drive100km() throws NotEnoughGas{
        if(fuel < 10) throw new NotEnoughGas("Less than 10l left. must refuel.");

            fuel -= 10;
            kilos += 100;
            System.err.println(kilos + " km travelled, fuel level: "+fuel);

    }
}