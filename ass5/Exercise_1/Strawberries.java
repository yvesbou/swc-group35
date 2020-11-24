/**
 * Strawberry extends the ToppingsDecorator and is part of the decorator design principle structure.
 */

public class Strawberries extends ToppingsDecorator {
    public Cake cake;

    /**
     * The constructor calls the ToppingsDecorator constructor
     * @param cake: the cake the strawberry is decorating, type Cake
     */
    public Strawberries(Cake cake){
        super(cake);
    }

    /**
     * Overrides the method cost from the ToppingsDecorator
     * @return the price of the strawberry + the cost of the ToppingsDecorator, makes sure all prices are count together, type double
     */
    @Override
    public double cost(){
        return 1 + super.cake.cost();
    }
}
