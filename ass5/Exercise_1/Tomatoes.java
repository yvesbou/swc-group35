public class Tomatoes extends FillingsDecorator{
    public Sandwich sandwich;

    public Tomatoes(Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double cost(){
        return 1.50 + super.sandwich.cost();
    }
}
