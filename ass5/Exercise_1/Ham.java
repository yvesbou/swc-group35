public class Ham extends FillingsDecorator {
    public Sandwich sandwich;

    public Ham(Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double cost(){
        return 2 + super.sandwich.cost();
    }
}
