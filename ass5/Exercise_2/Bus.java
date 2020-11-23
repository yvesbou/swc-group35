/**
 * The Bus class implements the Vehicle interface.
 * It is a concrete Vehicle of the transport System of the airport.
 * Instances can be created of this class.
 *
 * it contains fields describing following attributes of a Bus:
 * speed: relative speed of the Vehicle
 * price: price of a Ride in the Bus
 * name: the name of the Bus
 * fuel: the type of fuel the Bus needs.
 */
public class Bus implements Vehicle{
    private String speed = "slow";
    private String price = "5CHF";
    private String name = "Bus";
    private String bagsAllowed = "as much bags as you want";
    private String fuel = "diesel";

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
