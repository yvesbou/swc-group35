/**
 * The ToppingsDecorator belongs to the decorator design pattern, and extends the Cake class
 * The ToppingsDecorator is extended by the toppings a customer can add to his/her cake.
 */

public abstract class ToppingsDecorator extends Cake{
    public Cake cake;

    /**
     * The constructor is called by the single toppings
     * @param cake: cake the decorator should decorate
     */
    public ToppingsDecorator(Cake cake){
        this.cake = cake;
    }

    /**
     * This function is abstract and should be implemented by the single toppings
     * @return double
     */
    public abstract double cost();
}
