/**
 * The FillingsDecorator belongs to the decorator design pattern, and extends the Sandwich class
 * The FillingsDecorator is extended by the fillings a customer can add to his/her sandwich.
 */

public abstract class FillingsDecorator extends Sandwich{
    public Sandwich sandwich;

    /**
     * The constructor is called by the single fillings
     * @param sandwich: sandwich the decorator should decorate, type Sandwich
     */
    public FillingsDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    /**
     * This function is abstract and should be implemented by the single fillings
     * @return nothing since abstract
     */
    public abstract double cost();
}
