import java.util.ArrayList;

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
     * sweets only bakeries do not support this function
     * they only support selling sweets, the Exception has to be handled by the consumer, since
     * they have to realise that they went into the wrong shop
     */
    public Sandwich SellBreads(ArrayList lis) throws WeSellSweetsOnlyException {
        throw new WeSellSweetsOnlyException();
    }
}
