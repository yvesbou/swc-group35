public class Chocolate extends ToppingsDecorator {
    public Cake cake;

    public Chocolate(Cake cake){
        super(cake);
    }

    @Override
    public double cost(){
        return 2 + super.cake.cost();
    }
}
