public class Address {
    private String street;
    private int streetNum;
    private int postalCode;
    private String city;

    public Address(String street, int streetNum, int postalCode, String city){
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNum = streetNum;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
