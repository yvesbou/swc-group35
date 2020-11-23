/**
 * BreadOnlyBakery is actually a concrete Bakery type which has a name and an address.
 * Moreover it can sell breads/sandwiches.
 */

public class BreadOnlyBakery extends Bakery{

    /**
     * A bakery should have an address and a name.
     * @param address: each bakery should have an address
     * @param name: each bakery should have a name
     */
    public BreadOnlyBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    /**
     * A BreadOnlyBakery should be able to sell breads. (not implemented yet)
     * @return
     */
    @Override
    public Sandwich SellBreads(){
        // don't know how to implement sell yet
        return null;
    };

}
