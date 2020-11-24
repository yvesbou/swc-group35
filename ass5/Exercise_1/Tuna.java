/**
 * Tuna is a class that extends the FillingsDecorator and is part of the decorator design principle structure.
 */

public class Tuna extends FillingsDecorator{
    public Sandwich sandwich;

    /**
     * The Tuna class is initialized with a sandwich and calling the constructor of the FillingsDecorator.
     * @param sandwich: sandwich the tuna should decorate, type Sandwich
     */
    public Tuna(Sandwich sandwich){
        super(sandwich);
    }

    /**
     * Overrides the method cost from the FillingsDecorator
     * @return the price of the tuna + the cost of the FillingsDecorator, makes sure all prices are count together, type double
     */
    @Override
    public double cost(){
        return 3 + super.sandwich.cost();
    }
}
