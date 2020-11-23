/**
 * Tomatoes is class that extends the FillingsDecorator and is part of the decorator design principle structure.
 */

public class Tomatoes extends FillingsDecorator{
    public Sandwich sandwich;

    /**
     * The Tomatoes class is initialized with a sandwich and calling the constructor of the FillingsDecorator.
     * @param sandwich: the tomatoes should decorate
     */
    public Tomatoes(Sandwich sandwich){
        super(sandwich);
    }

    /**
     * Overrides the method cost from the FillingsDecorator
     * @return the price of the tomatoes + the cost of the FillingsDecorator, makes sure all prices are count together
     */
    @Override
    public double cost(){
        return 1.50 + super.sandwich.cost();
    }
}
