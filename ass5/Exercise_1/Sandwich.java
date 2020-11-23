/**
 * The Sandwich is the parent within the decorator design pattern. It is extended by the sandwich cake
 * and the fillingsDecorator.
 */

public abstract class Sandwich {

    /**
     * This function is abstract and is overridden by the Bread and the different sandwich fillings
     * @return nothing since abstract
     */
    public abstract double cost();
}
