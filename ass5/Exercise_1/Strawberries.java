public class Strawberries extends ToppingsDecorator {
    public Cake cake;

    public Strawberries(Cake cake){
        super(cake);
    }

    @Override
    public double cost(){
        return 1 + super.cake.cost();
    }
}
