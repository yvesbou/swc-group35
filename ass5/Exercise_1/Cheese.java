/**
 * Cheese is class that extends the FillingsDecorator and is part of the decorator design principle structure.
 */

public class Cheese extends FillingsDecorator {
    public Sandwich sandwich;

    /**
     * The Cheese class is initialized with a sandwich and calling the constructor of the FillingsDecorator.
     * @param sandwich: the cheese should decorate
     */
    public Cheese(Sandwich sandwich){
        super(sandwich);
    }

    /**
     * Overrides the method cost from the Fillingsdecorator
     * @return the price of the cheese + the cost of the FillingsDecorator, makes sure all prices are count together
     */
    @Override
    public double cost(){
        return 1 + super.sandwich.cost();
    }
}
