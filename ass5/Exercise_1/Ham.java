/**
 * Ham is class that extends the FillingsDecorator and is part of the decorator design principle structure.
 */

public class Ham extends FillingsDecorator {
    public Sandwich sandwich;

    /**
     * The Ham class is initialized with a sandwich and calling the constructor of the FillingsDecorator.
     * @param sandwich: the ham should decorate
     */
    public Ham(Sandwich sandwich){
        super(sandwich);
    }

    /**
     * Overrides the method cost from the Fillingsdecorator
     * @return the price of the ham + the cost of the FillingsDecorator, makes sure all prices are count together
     */
    @Override
    public double cost(){
        return 2 + super.sandwich.cost();
    }
}
