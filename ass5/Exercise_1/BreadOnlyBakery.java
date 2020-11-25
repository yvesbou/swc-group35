import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
     * bread only bakeries do not support this function
     * they only support selling breads, the Exception has to be handled by the consumer, since
     * they have to realise that they went into the wrong shop
     */
    public Cake SellSweets(ArrayList lis) throws WeSellBreadOnlyException {
        throw new WeSellBreadOnlyException();
    }

}
