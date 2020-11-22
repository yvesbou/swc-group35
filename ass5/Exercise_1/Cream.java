public class Cream extends ToppingsDecorator {
    public Cake cake;

    public Cream(Cake cake){
        super(cake);
    }

    @Override
    public double cost(){
        return 1.5 + super.cake.cost();
    }
}
