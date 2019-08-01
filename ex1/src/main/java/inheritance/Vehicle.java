package inheritance;

/**
 * @author Nico
 */
public class Vehicle {
    /**
     * The name of the vehicle
     */
    String name;

    /**
     * The color of the vehicle
     */
    String color;

    /**
     * Number of wheels on the vehicle
     */
    int wheels;

    /**
     * @param color
     * @param name
     * @param wheels
     */
    public Vehicle(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public int getWheels(){
        return this.wheels;
    }
}