/**
 * The cake is the parent within the decorator design pattern. It is extended by the raw cake
 * and the toppingsDecorator.
 */

public abstract class Cake {

    /**
     * This function is abstract and is overriden by the raw cake and the different cake toppings
     * @return nothing since abstract
     */
    public abstract double cost();
}
