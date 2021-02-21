package inheritance;

/**
 * @author Nico
 */
public class Car extends Vehicle {
    /**
     * @param color
     * @param name
     * @param wheels
     */
    
    public Car(String name, String color) {
        super(name, color);
        this.wheels = 4;
    }
}