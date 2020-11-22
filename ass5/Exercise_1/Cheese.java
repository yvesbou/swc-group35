public class Cheese extends FillingsDecorator {
    public Sandwich sandwich;

    public Cheese(Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double cost(){
        return 1 + super.sandwich.cost();
    }
}
