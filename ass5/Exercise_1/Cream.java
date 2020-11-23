/**
 * Cream extends the ToppingsDecorator and is part of the decorator design principle structure.
 */

public class Cream extends ToppingsDecorator {
    public Cake cake;

    /**
     * The constructor calls the ToppingsDecorator constructor
     * @param cake: the cake the cream is decorating
     */
    public Cream(Cake cake){
        super(cake);
    }

    /**
     * Overrides the method cost from the ToppingsDecorator
     * @return the price of the cream + the cost of the ToppingsDecorator, makes sure all prices are count together
     */
    @Override
    public double cost(){
        return 1.5 + super.cake.cost();
    }
}
