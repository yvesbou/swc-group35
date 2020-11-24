/**
 * SweetsOnlyBakery is actually a concrete Bakery type which has a name and an address.
 * Moreover it can sell sweets/cakes.
 */

public class SweetsOnlyBakery extends Bakery{
    /**
     * A bakery should have an address and a name.
     * @param address: each bakery should have an address, type Address
     * @param name: each bakery should have a name, type String
     */
    public SweetsOnlyBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    /**
     * A SweetsOnlyBakery should be able to sell breads. (not implemented yet)
     * @return
     */
    @Override
    public Cake SellSweets(){
        // don't know how to implement sell yet
        return null;
    }
}
