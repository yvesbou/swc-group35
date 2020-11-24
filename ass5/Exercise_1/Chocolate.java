/**
 * Chocolate extends the ToppingsDecorator and is part of the decorator design principle structure.
 */

public class Chocolate extends ToppingsDecorator {
    public Cake cake;

    /**
     * The constructor calls the ToppingsDecorator constructor
     * @param cake: the cake the chocolate is decorating, type Cake
     */
    public Chocolate(Cake cake){
        super(cake);
    }

    /**
     * Overrides the method cost from the ToppingsDecorator
     * @return the price of the chocolate + the cost of the ToppingsDecorator, makes sure all prices are count together, type double
     */
    @Override
    public double cost(){
        return 2 + super.cake.cost();
    }
}
