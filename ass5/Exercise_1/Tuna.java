public class Tuna extends FillingsDecorator{
    public Sandwich sandwich;

    public Tuna(Sandwich sandwich){
        super(sandwich);
    }

    @Override
    public double cost(){
        return 3 + super.sandwich.cost();
    }
}
