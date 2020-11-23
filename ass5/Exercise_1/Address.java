/**
 * This class implements an address class. Our bakeries need an address, so to easily
 * write Addresses we implemented this class.
 */


public class Address {
    private String street;
    private int streetNum;
    private int postalCode;
    private String city;

    /**
     * A bakery has the following address components:
     * @param street
     * @param streetNum
     * @param postalCode
     * @param city
     */
    public Address(String street, int streetNum, int postalCode, String city){
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNum = streetNum;
    }

}
