import java.awt.Color;

public class Car {
    private String make;
    private Color color;

    public Car(String make, int r, int g, int b) {
        this.make = make;
        this.color = new Color(r, g, b);
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }
}
