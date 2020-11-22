public abstract class FillingsDecorator extends Sandwich{
    public Sandwich sandwich;

    public FillingsDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public abstract double cost();
}
