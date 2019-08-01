package inheritance;

public class Motorbike extends Vehicle {
    /**
     * @param color
     * @param name
     * @param wheels
     */
    public Motorbike(String name, String color) {
        super(name, color);
        this.wheels = 2;
    }
}