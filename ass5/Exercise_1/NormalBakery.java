/**
 * NormalBakery is actually a Bakery type which has a name and an address.
 * Moreover it can sell breads/sandwiches and sweets like cake
 */

public class NormalBakery extends Bakery {

    /**
     * A bakery should have an address and a name.
     * @param address: each bakery should have an address
     * @param name: each bakery should have a name
     */
    public NormalBakery(Address address, String name){
        this.name = name;
        this.address = address;
    }

    /**
     * A NormalBakery should be able to sell breads. (not implemented yet)
     * @return
     */
    @Override
    public Sandwich SellBreads(){
        // don't know how to implement sell yet
        return null;
    };

    /**
     * A NormalBakery should be able to sell sweets. (not implemented yet)
     * @return
     */
    @Override
    public Cake SellSweets(){
        // don't know how to implement sell yet
        return null;
    }
}
