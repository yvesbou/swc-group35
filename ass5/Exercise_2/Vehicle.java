/**
 * This is the vehicle interface.
 * It implements the Strategy pattern.
 * It is allowed to make new Classes, which implement the Vehicel interface.
 */
public interface Vehicle {
    /**
     *This is the getter for the speed field.
     * @return the speed field.
     */
    public String getSpeed();
    /**
     *This is the getter for the name field.
     * @return the name field.
     */
    public String getName();
    /**
     *This is the getter for the bagsAllow field.
     * @return the speed field.
     */
    public String getBagsAllowed();
    /**
     *This is the getter for the price field.
     * @return the price field.
     */
    public String getPrice();
}

