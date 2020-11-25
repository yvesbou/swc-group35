/**
 * NormalBakery is actually a Bakery type which has a name and an address.
 * Moreover it can sell breads/sandwiches and sweets like cake
 */

public class NormalBakery extends Bakery {

    /**
     * A bakery should have an address and a name.
     * @param address: each bakery should have an address, type Address
     * @param name: each bakery should have a name, type String
     */
    public NormalBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }
}
