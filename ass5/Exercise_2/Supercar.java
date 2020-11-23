/**
 * The Supercar class implements the Vehicle interface.
 * It is a concrete Vehicle of the transport System of the airport.
 * Instances can be created of this class.
 *
 * it contains fields describing following attributes of a Bus:
 * speed: relative speed of the Vehicle
 * price: price of a Ride in the Bus
 * name: the name of the Bus
 * fuel: the type of fuel the Bus needs.
 */
public class Supercar implements Vehicle{
    private String speed = "fast";
    private String price = "30CHF/h";
    private String name = "supercar";
    private String bagsAllowed = "1 small and 1 large bags";
    private String fuel = "gasoline";
    /**
     *This is the getter for the speed field.
     * @return the speed field.
     */
    public String getSpeed(){
        return speed;
    }
    /**
     *This is the getter for the name field.
     * @return the name field.
     */
    public String getName(){
        return name;
    }
    /**
     *This is the getter for the bagsAllow field.
     * @return the speed field.
     */
    public String getBagsAllowed(){
        return bagsAllowed;
    }
    /**
     *This is the getter for the price field.
     * @return the price field.
     */
    public String getPrice(){
        return price;
    }
}
